package com.example.myproject.Service;

import com.example.myproject.Entities.Configuration;
import java.util.List;

public interface IConfigurationService {
    List<Configuration> getAllConfigs();
    void addConfig(Configuration configuration);
    void deleteConfig(int id);
    Configuration updateConfig(Configuration configuration);
    //Configuration findByNameandDescription();
}
