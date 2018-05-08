package helloworld.extensions;

import com.plentymarkets.tool.plugins.api.extensions.PopupMenuExtension;
import org.pf4j.Extension;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

@Extension
public class MenuExtension implements PopupMenuExtension
{
    @Override
    public void buildMenu(Menu menu)
    {
        MenuItem menuItem = new MenuItem("Hello world!");
        menuItem.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                System.out.println("Hello world!");
            }
        });

        menu.add(menuItem);
    }
}
