package fr.msua.main;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.plugin.messaging.PluginMessageListener;

import fr.msua.api.MetaUserConnectEvent;

public class MetaUserListener extends JavaPlugin implements PluginMessageListener {
	
	@Override
	public void onEnable() {
	    getServer().getMessenger().registerIncomingPluginChannel((Plugin)this, "MCC", this);
	    getServer().getMessenger().registerOutgoingPluginChannel((Plugin)this, "MCC");
	}
	
	@Override
	public void onDisable() {}
	
	@Override
	public void onPluginMessageReceived(String channel, Player p, byte[] bytes) {
		if (channel.equals("MCC")) {
			Bukkit.getPluginManager().callEvent(new MetaUserConnectEvent(p));
		}
	}
	

}
