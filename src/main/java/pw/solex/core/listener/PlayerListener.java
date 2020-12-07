package pw.solex.core.listener;

import net.md_5.bungee.api.ProxyServer;
import net.md_5.bungee.api.connection.ProxiedPlayer;
import net.md_5.bungee.api.event.PlayerDisconnectEvent;
import net.md_5.bungee.api.event.ServerSwitchEvent;
import net.md_5.bungee.api.plugin.Listener;
import net.md_5.bungee.event.EventHandler;
import pw.solex.core.util.CC;
import pw.solex.core.util.Server;

public class PlayerListener implements Listener {

    @EventHandler
    public void onJoin(ServerSwitchEvent event) {
        ProxiedPlayer player = event.getPlayer();
        if (player.hasPermission("bungee.staff")) {
            for (ProxiedPlayer online : ProxyServer.getInstance().getPlayers()) {
                if (online.hasPermission("bungee.staff")) {
                    online.sendMessage(CC.colors("&8[&6Staff&8] &b" + player.getName() + "&a has joined &9" + Server.getServer(player)));
                }
            }
        }
    }

    @EventHandler
    public void onQuit(PlayerDisconnectEvent event) {
        ProxiedPlayer player = event.getPlayer();
        if (player.hasPermission("bungee.staff")) {
            for (ProxiedPlayer online : ProxyServer.getInstance().getPlayers()) {
                if (online.hasPermission("bungee.staff")) {
                    online.sendMessage("&8[&6Staff&8] &b" + player.getName() + "&c has left &9" + Server.getServer(player));
                }
            }
        }
    }
}
