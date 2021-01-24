package com.connex.ctoml.userdetails;


import com.connex.ctoml.securitymodels.ERole;
import com.connex.ctoml.securitymodels.Role;
import com.connex.ctoml.securitymodels.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashSet;
import java.util.Set;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {


    @Override
    @Transactional
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = new User(null, null, null);
        Set<Role> roles = new HashSet<>();
        Role role = new Role(200, ERole.ROLE_USER);
        roles.add(role);
        user.setRoles(roles);
        return UserDetailsImpl.build(user);
    }


}