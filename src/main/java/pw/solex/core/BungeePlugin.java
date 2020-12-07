package pw.solex.core;

import lombok.Getter;
import net.md_5.bungee.api.plugin.Plugin;
import pw.solex.core.listener.PlayerListener;

@Getter
public class BungeePlugin extends Plugin {

    @Getter private static BungeePlugin instance;

    public void onEnable() {
        instance = this;

        getProxy().getPluginManager().registerListener(this, new PlayerListener());
    }
}
