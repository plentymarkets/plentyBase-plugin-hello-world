package helloworld;

import com.plentymarkets.tool.plugins.api.context.ContextInjector;
import com.plentymarkets.tool.plugins.api.context.PluginApplicationContext;
import com.plentymarkets.tool.plugins.api.context.PluginContext;
import org.apache.logging.log4j.Logger;

@PluginContext
public class PluginAppContext {
    protected static PluginApplicationContext pluginApplicationContext;

    @ContextInjector
    public static void inject(PluginApplicationContext context) {
        pluginApplicationContext = context;
    }

    public static Logger getPluginLogger() {
        return pluginApplicationContext.getPluginLogger();
    }
}
