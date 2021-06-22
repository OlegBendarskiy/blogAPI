package oleh_bendarskyi.api.repositories.impl;

import com.google.gson.Gson;
import oleh_bendarskyi.api.models.PersonalInfo;
import oleh_bendarskyi.api.repositories.PersonalInfoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Objects;

@Repository
public class PersonalInfoRepositoryImpl implements PersonalInfoRepository {

    @Autowired
    private Gson gson;

    public PersonalInfo getPersonalInfo() throws Exception {
        File file = new File(
                Objects.requireNonNull(this.getClass().getClassLoader().getResource("static/personal_info.json")).getFile()
        );
        return gson.fromJson(readFileAsString(file), PersonalInfo.class);
    }

    public static String readFileAsString(File files) throws Exception {
        return new String(Files.readAllBytes(Paths.get(files.getPath())));
    }
}
