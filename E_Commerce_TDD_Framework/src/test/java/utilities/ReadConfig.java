package utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig {

    Properties properties;

    //Function : Reads all properties from the config.properties File
    public ReadConfig() {

        File src = new File("./Configuration/config.properties");

        try {
            FileInputStream fis = new FileInputStream(src);
            properties = new Properties();
            properties.load(fis);

        } catch (Exception e) {
            System.out.println("Exception is " + e.getMessage());
        }
    }

    //Function : Gets applications (URL)
    public String getApplicationURL() {
        String url = properties.getProperty("baseURL");
        return url;
    }

    //Function : Gets Chrome Path
    public String getChromePath() {
        String chromepath = properties.getProperty("chromepath");
        return chromepath;
    }

    //Function : Gets FireFox Path
    public String getGeckoPath() {
        String geckopath = properties.getProperty("geckopath");
        return geckopath;
    }

    //Function : Gets MsEdge Path
    public String getMsEdgePath() {
        String msedgepath = properties.getProperty("msedgepath");
        return msedgepath;
    }

    public String getUsername() {
        String username = properties.getProperty("username");
        return username;
    }

    public String getPassword() {
        String password = properties.getProperty("password");
        return password;   }


}

