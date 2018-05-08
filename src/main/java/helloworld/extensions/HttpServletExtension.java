package helloworld.extensions;

import com.plentymarkets.tool.plugins.api.extensions.ServletExtension;
import helloworld.HelloWorldServlet;
import org.pf4j.Extension;

import javax.servlet.http.HttpServlet;
import java.util.HashMap;
import java.util.Map;

@Extension
public class HttpServletExtension implements ServletExtension
{
    @Override
    public Map<String, HttpServlet> getServlets()
    {
        Map<String, HttpServlet> httpServletMap = new HashMap<>();
        httpServletMap.put("/helloworld", new HelloWorldServlet());

        return httpServletMap;
    }
}
