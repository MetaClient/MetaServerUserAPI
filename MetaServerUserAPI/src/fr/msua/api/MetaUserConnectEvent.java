package fr.msua.api;

import org.bukkit.entity.Player;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

public class MetaUserConnectEvent extends Event {

	private Player p;
    private static final HandlerList HANDLERS_LIST = new HandlerList();

    public MetaUserConnectEvent(Player p) {
        this.p = p;
    }

    @Override
    public HandlerList getHandlers() {
        return HANDLERS_LIST;
    }

    public static HandlerList getHandlerList() {
        return HANDLERS_LIST;
    }

    public Player getPlayer() {
        return p;
    }

}
