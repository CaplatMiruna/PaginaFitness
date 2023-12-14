package com.example.FitnessApplication;

import jakarta.transaction.Transactional;
import org.antlr.v4.runtime.misc.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
//@Transactional
public class UserService {
    private final UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }



    public User addUser(User user)
    {  user.setUserCode(UUID.randomUUID().toString());
        return userRepository.save(user);
    }
    public List<User> findAllUser()
    {
        return userRepository.findAll();
    }

    public User updateUser(User user)
    {
        Long userId = user.getId();
        User existingUser = userRepository.findById(userId)
                .orElseThrow(() -> new UserNotFoundException("Utilizatorul cu ID-ul " + userId + " nu a fost găsit"));

        existingUser.setName(user.getName());
        existingUser.setAge(user.getAge());
        existingUser.setHeight(user.getHeight());
        existingUser.setWeight(user.getWeight());

        // return userRepository.save(user);
        return userRepository.save(existingUser);
    }

    public User findUserById(Long id)
    {
        return userRepository.findUserById(id).orElseThrow(()->new UserNotFoundException(
                "User by id"+id+" was not found!"

        ));
    }

    @Transactional
    public void deleteUser(Long id)
    {
        userRepository.deleteUserById(id);
    }
}
