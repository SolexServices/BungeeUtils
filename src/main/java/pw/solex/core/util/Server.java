package pw.solex.core.util;

import net.md_5.bungee.api.connection.ProxiedPlayer;

public class Server {
    public static String getServer(ProxiedPlayer player) {
        return player.getServer().getInfo().getName();
    }
}
