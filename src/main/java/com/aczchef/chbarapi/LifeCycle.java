package com.aczchef.chbarapi;

import com.laytonsmith.PureUtilities.SimpleVersion;
import com.laytonsmith.PureUtilities.Version;
import com.laytonsmith.core.extensions.AbstractExtension;
import com.laytonsmith.core.extensions.MSExtension;

/**
 *
 * @author cgallarno
 */
@MSExtension("CHBarApi")
public class LifeCycle extends AbstractExtension {
    
    @Override
    public void onStartup() {
        System.out.println("[CommandHelper] CHBarApi: Initialized");
    }
    
    @Override
    public void onShutdown() {
        System.out.println("[CommandHelper] CHBarApi: De-Initialized");
    }

    public Version getVersion() {
	return new SimpleVersion(1, 2, 0);
    }
}
