package org.openstreetmap.josm.plugins.geojson;

import org.openstreetmap.josm.actions.ExtensionFileFilter;
import org.openstreetmap.josm.plugins.Plugin;
import org.openstreetmap.josm.plugins.PluginInformation;

/**
 * Main class for the geojson plugin.
 *
 * @author Ian Dees <ian.dees@gmail.com>
 * @author matthieun <https://github.com/matthieun>
 */
public class GeoJsonPlugin extends Plugin
{
    public GeoJsonPlugin(final PluginInformation info)
    {
        super(info);
        ExtensionFileFilter.importers.add(new GeoJsonFileImporter());
        ExtensionFileFilter.updateAllFormatsImporter();
    }
}
