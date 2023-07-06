package me.thomas.pluginorix.effects;

import org.bukkit.entity.Item;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.PlayerInventory;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class ArmorEffect {

    public static void addArmor(Player p, int slot, ItemStack itm) {

        PlayerInventory inv = p.getInventory();
        ItemStack helmet = inv.getHelmet();
        ItemStack chestplate = inv.getChestplate();
        ItemStack leggings = inv.getLeggings();
        ItemStack boots = inv.getBoots();

        if(slot == 5) helmet = itm;

        if (helmet != null
            && helmet.hasItemMeta()
            && itm.getItemMeta().getDisplayName().equalsIgnoreCase("&5Casque d'Mz")) {
            p.addPotionEffect(new PotionEffect(PotionEffectType.FAST_DIGGING, Integer.MAX_VALUE, 1));

        }
    }
}
