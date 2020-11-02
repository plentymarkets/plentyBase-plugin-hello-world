package helloworld;

import java.util.Properties;

public class HelloWorldConfiguration extends PluginAppContext {
    private static Properties config = pluginApplicationContext.getPluginConfig();

    public static void saveConfiguration() {
        pluginApplicationContext.savePluginConfig();
    }

    public static String getSomeValue() {
        return config.getProperty("key1");
    }

    public static void setSomeValue(String value) {
        config.setProperty("key1", value);
    }

    public static String getAnotherValue() {
        return config.getProperty("key2");
    }

    public static void setAnotherValue(String value) {
        config.setProperty("key2", value);
    }
}
