//package com.harshal.placements.Service;
//import com.harshal.placements.Model.Employee;
////import com.harshal.placements.Model.UserPrincipal;
//import com.harshal.placements.Model.UserPrincipal;
//import com.harshal.placements.Repository.EmployeeRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.core.userdetails.UsernameNotFoundException;
//import org.springframework.stereotype.Service;
//
//
//@Service
//public class MyUserDetailsService implements UserDetailsService {
//
//    @Autowired
//    private EmployeeRepository employeeRepository;
//
//    @Override
//    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException{
//
//        Employee employee = employeeRepository.findByUsername(username);
//
//        if(employee == null) {
//            System.out.println("User Not Found");
//            throw new UsernameNotFoundException("User Not Found");
//        }
//
//        return new UserPrincipal(employee);
//    }
//
//}
