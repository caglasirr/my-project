package com.example.myproject.Service;

import com.example.myproject.DataAccess.ConfigurationDao;
import com.example.myproject.Entities.Configuration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ConfigurationService implements IConfigurationService{

//    public Configuration findByNameandDescription() {
//
//        var cities =  configurationDao.findByNameandDescription();
//        return cities;
//    }

    @Autowired
    public ConfigurationService(ConfigurationDao configurationDao) {
        this.configurationDao = configurationDao;
    }

    private ConfigurationDao configurationDao;

    @Override
    public List<Configuration> getAllConfigs() {
        return (List<Configuration>) this.configurationDao.findAll();
    }

    @Override
    public void addConfig(Configuration configuration) {
        this.configurationDao.save(configuration);
    }

    @Override
    public void deleteConfig(int id) {this.configurationDao.deleteById(id);}

    @Override
    public Configuration updateConfig(Configuration configuration) {
        Configuration selectedConfiguration = configurationDao.findById(configuration.getId()).orElse(configuration);
        selectedConfiguration.setName(configuration.getName());
        selectedConfiguration.setDescription(configuration.getDescription());
        selectedConfiguration.setSearchType(configuration.getSearchType());
        selectedConfiguration.setSourceType(configuration.getSourceType());
        selectedConfiguration.setCreateDate(configuration.getCreateDate());
        selectedConfiguration.setCreatedByUserName(configuration.getCreatedByUserName());
        return configurationDao.save(selectedConfiguration);
    }
}
