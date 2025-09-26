package org.ctk.api;

import jakarta.validation.Valid;
import org.ctk.model.ContactRequest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class ContactController {

    private static final Logger log = LoggerFactory.getLogger(ContactController.class);

    @PostMapping("/contact")
    public ResponseEntity<?> contact(@Valid @RequestBody ContactRequest request) {
        // Stub: for now, just log and return 200 OK
        log.info("Contact request from {} <{}>: {}", request.getName(), request.getEmail(), request.getMessage());
        return ResponseEntity.ok().build();
    }
}
