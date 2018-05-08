package helloworld;

import org.apache.logging.log4j.Logger;
import org.pf4j.Plugin;
import org.pf4j.PluginException;
import org.pf4j.PluginWrapper;

public class HelloWorldPlugin extends Plugin
{
    private static final Logger logger = PluginAppContext.getPluginLogger();

    /**
     * Constructor to be used by plugin manager for plugin instantiation.
     * Your plugins have to provide constructor with this exact signature to
     * be successfully loaded by manager.
     *
     * @param wrapper
     */
    public HelloWorldPlugin(PluginWrapper wrapper)
    {
        super(wrapper);
    }

    @Override
    public void start() throws PluginException
    {
        logger.info("Plugin start!");
    }

    @Override
    public void stop() throws PluginException
    {
        logger.info("Plugin stop!");
    }

    @Override
    public void delete() throws PluginException
    {
        logger.info("Plugin delete!");
    }
}
