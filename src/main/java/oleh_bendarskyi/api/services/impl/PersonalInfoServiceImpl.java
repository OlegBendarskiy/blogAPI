package oleh_bendarskyi.api.services.impl;

import oleh_bendarskyi.api.models.PersonalInfo;
import oleh_bendarskyi.api.repositories.PersonalInfoRepository;
import oleh_bendarskyi.api.services.PersonalInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonalInfoServiceImpl implements PersonalInfoService {

    @Autowired
    private PersonalInfoRepository personalInfoRepository;

    public PersonalInfo getPersonalInfo() {
        try {
            return personalInfoRepository.getPersonalInfo();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
