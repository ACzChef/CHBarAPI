package com.aczchef.chbarapi;

import com.aczchef.aczextension.LogUtils;
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
        LogUtils.initMessage(this.getName());
    }
    
    @Override
    public void onShutdown() {
        LogUtils.deInitMessage(this.getName());
    }
}
