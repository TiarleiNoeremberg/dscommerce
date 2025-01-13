package com.tiarlei.dscommerce.controllers;

import com.tiarlei.dscommerce.dto.UserDTO;
import com.tiarlei.dscommerce.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/users")
public class UserController {

    @Autowired
    private UserService service;

    @PreAuthorize("hasAnyRole('ROLE_ADMIN', 'ROLE_CLIENT')")
    @GetMapping(value = "/me")
    public ResponseEntity<UserDTO> getMe() {
        //ProductDTO dto = service.findById(id);
        //return dto;
        //return service.findById(id);    //Esta linha oferece uma opcao mais simplificada do comando comentado acima.
        //codigo acima era anterior ao ResponseEntity
        UserDTO dto = service.getMe();
        return ResponseEntity.ok(dto);
    }
}
