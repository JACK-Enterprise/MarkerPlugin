package com.jack.plugins;

import com.jack.annotations.RenderGPS;
import com.jack.engine.GPSCoord;
import com.jack.engine.render.Marker;
import javafx.scene.Group;

/**
 * A Plugin that marks a location in the map
 * @author Aurelien
 */

@RenderGPS
@com.jack.plugins.manager.PluginDescriptor(author="JackEnterprise", version="1.0", name="Marker", description="A marker plugin that enables to point locations")
public class MarkerPlugin extends com.jack.plugins.manager.PluginBase {

        public Object run(Object ... args) {
            if(args != null && args.length == 3)
            {
                GPSCoord coord = (GPSCoord) args[0];
                Group root = (Group) args[1];
                double radius = (double) args[2];
                
                Marker marker = new Marker(coord);
                
                marker.render(root, radius);
            }
            
            return null;
        }
	
}
