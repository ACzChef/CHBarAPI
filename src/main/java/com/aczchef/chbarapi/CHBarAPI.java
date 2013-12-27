package com.aczchef.chbarapi;

import com.laytonsmith.core.extensions.AbstractExtension;
import com.laytonsmith.core.extensions.MSExtension;

/**
 *
 * @author cgallarno
 */
@MSExtension("CHBarApi")
public class CHBarAPI extends AbstractExtension {
    @Override
    public void onStartup() {
        System.out.println("[CommandHelper] CHBarAPI: Initialized - ACzChef");
    }
    
    @Override
    public void onShutdown() {
        System.out.println("[CommandHelper] CHBarAPI: De-Initialized - ACzChef");
    }
}
