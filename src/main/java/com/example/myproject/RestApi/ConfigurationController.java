package com.example.myproject.RestApi;

import com.example.myproject.Entities.Configuration;
import org.springframework.beans.factory.annotation.Autowired;
import com.example.myproject.Service.IConfigurationService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins="http://localhost:4200/")
@RequestMapping("/api")
public class ConfigurationController {

    @Autowired
    public ConfigurationController(IConfigurationService configurationService) {
        this.configurationService = configurationService;
    }

    private IConfigurationService configurationService;

    @GetMapping("/configs")
    public List<Configuration> getAllConfigs(){return configurationService.getAllConfigs();}

//    public Configuration getAllConfigs(){
//        return configurationService.findByNameandDescription();
//    }

    @PostMapping("/addConfig")
    public void addConfig(@RequestBody Configuration configuration) {
        this.configurationService.addConfig(configuration);
    }

    @DeleteMapping("/deleteConfig/{id}")
    public void deleteConfig(@PathVariable int id) { this.configurationService.deleteConfig(id); }

    @PutMapping("/updateConfig")
    public Configuration updateConfig(@RequestBody Configuration configuration) {
        return this.configurationService.updateConfig(configuration);
    }




}
