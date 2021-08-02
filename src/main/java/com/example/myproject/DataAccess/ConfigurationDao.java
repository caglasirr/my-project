package com.example.myproject.DataAccess;

import com.example.myproject.Entities.Configuration;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ConfigurationDao extends CrudRepository<Configuration, Integer> {
    //@Query("select c from Configuration c where c.name='Deneme' and c.description='DenemeDescription'")
    //Configuration findByNameandDescription();
}
