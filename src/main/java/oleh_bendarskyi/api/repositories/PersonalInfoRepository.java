package oleh_bendarskyi.api.repositories;

import oleh_bendarskyi.api.models.PersonalInfo;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonalInfoRepository {
    PersonalInfo getPersonalInfo() throws Exception;
}
