package oleh_bendarskyi.api.services;

import oleh_bendarskyi.api.models.PersonalInfo;
import org.springframework.stereotype.Service;

@Service
public interface PersonalInfoService {
    PersonalInfo getPersonalInfo();
}
