package tubeTransportSystem.network;

import tubeTransportSystem.client.RenderStation;
import tubeTransportSystem.client.RenderTube;
import cpw.mods.fml.client.registry.RenderingRegistry;
import tubeTransportSystem.client.RenderTubeTurbo;

public class ProxyClient extends ProxyCommon {
    @Override
    public void miscSetup() {
        super.miscSetup();
        RenderTube.ID = RenderingRegistry.getNextAvailableRenderId();
        RenderingRegistry.registerBlockHandler(RenderTube.ID, new RenderTube());
        RenderTubeTurbo.ID = RenderingRegistry.getNextAvailableRenderId();
        RenderingRegistry.registerBlockHandler(RenderTubeTurbo.ID, new RenderTubeTurbo());
        RenderStation.ID = RenderingRegistry.getNextAvailableRenderId();
        RenderingRegistry.registerBlockHandler(RenderStation.ID, new RenderStation());
    }
}
