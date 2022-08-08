package net.poweredbyawesome.blockdecay;

import org.bukkit.Bukkit;
import org.bukkit.Location;

import java.util.Objects;

public class LocationUtils {

    public static String locToString(Location loc) {
        String world = Objects.requireNonNull(loc.getWorld()).getName();
        int x = loc.getBlockX();
        int y = loc.getBlockY();
        int z = loc.getBlockZ();
        return world+"~"+x+"~"+y+"~"+z;
    }

    public static Location stringToLoc(String s) {
        String[] loc = s.split("~");
        return new Location(Bukkit.getWorld(loc[0]),Double.parseDouble(loc[1]),Double.parseDouble(loc[2]),Double.parseDouble(loc[3]));
    }
}
