package com.alexpander.testmod.configuration;

import net.minecraftforge.common.config.Configuration;

import java.io.File;

/**
 * Created by Danny on 2/26/2015.
 */
public class ConfigurationHandler {

    public static  void init(File configFile){
        // Create the configuration object from the given file.
        Configuration configuration = new Configuration(configFile);
        boolean configValue = false;
        try{
            // Load the config file.
            configuration.load();

            // Read in properties from the config file.
            configValue = configuration.get(Configuration.CATEGORY_GENERAL,"configValue", true, "This is an example config value.").getBoolean(true);
        }
        catch (Exception e){
            // Log the exception.
        }
        finally{
            // Save the config file.
            configuration.save();
        }

        System.out.println(configValue);

    }
}
