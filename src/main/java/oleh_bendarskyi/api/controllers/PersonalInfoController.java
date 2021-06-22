package oleh_bendarskyi.api.controllers;

import oleh_bendarskyi.api.models.PersonalInfo;
import oleh_bendarskyi.api.services.PersonalInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonalInfoController {

    @Autowired
    private PersonalInfoService personalInfoService;

    @GetMapping("/")
    public PersonalInfo getHomePageInfo() {
        return personalInfoService.getPersonalInfo();
    }
}