package com.tesda.bankwebapp.services;

// import java.util.HashSet;
// import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
// import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

// import com.tesda.bankwebapp.models.ApplicationUser;
// import com.tesda.bankwebapp.models.Role;
import com.tesda.bankwebapp.repository.UserRepository;

@Service
public class UserService implements UserDetailsService {

    // @Autowired
    // private PasswordEncoder encoder;

    @Autowired
    private UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        System.out.println("In the user details service");

        // if (!username.equals("Ethan"))
        // throw new UsernameNotFoundException("Not Ethan");

        // Set<Role> roles = new HashSet<>();
        // roles.add(new Role(1, "USER"));

        // return new ApplicationUser(1, "Ethan", encoder.encode("password"), roles);

        return userRepository.findByUsername(username)
                .orElseThrow(() -> new UsernameNotFoundException("user is not valid"));

    }

}
