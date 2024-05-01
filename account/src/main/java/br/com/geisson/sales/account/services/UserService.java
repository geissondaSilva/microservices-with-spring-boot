package br.com.geisson.sales.account.services;

import br.com.geisson.sales.account.models.User;
import br.com.geisson.sales.account.repositories.UserRepository;
import org.springframework.stereotype.Service;

import java.util.Objects;
import java.util.Optional;

@Service
public class UserService {

    private final UserRepository repository;

    public UserService(UserRepository repository) {
        this.repository = repository;
    }

    public String create(User user) {
        if (isEmailCreated(user.getEmail(), user.getId())) {
            throw new RuntimeException("E-mail alread exists!");
        }
        repository.save(user);
        return user.getId();
    }

    private boolean isEmailCreated(String email, String id) {
        Optional<User> byEmail = repository.findByEmail(email);
        return byEmail.isPresent() && !Objects.equals(id, byEmail.get().getId());
    }
}
