package net.ninjaworks.fundystyle.registrations;

import net.ninjaworks.fundystyle.FundyStyle;
import net.ninjaworks.fundystyle.event.MainEventManager;
import net.ninjaworks.fundystyle.event.MainListener;
import org.bukkit.Bukkit;

public class Registrations {

    public void register() {

        registerListeners();

    }

    public void registerListeners() {
        Bukkit.getPluginManager().registerEvents(new MainListener(), new FundyStyle());
    }

}
