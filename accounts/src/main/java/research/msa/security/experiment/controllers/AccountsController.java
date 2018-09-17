package research.msa.security.experiment.controllers;

import research.msa.security.experiment.models.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.oauth2.provider.OAuth2Authentication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/users")
public class AccountsController {

    private final UsersRepository usersRepository;

    @Autowired
    public AccountsController(UsersRepository usersRepository) {
        this.usersRepository = usersRepository;
    }

    @RequestMapping(method = RequestMethod.GET, value = "/me")
    public ResponseEntity t(OAuth2Authentication authentication) {
        return ResponseEntity.ok(this.usersRepository.findByName(authentication.getName()));
    }
}
