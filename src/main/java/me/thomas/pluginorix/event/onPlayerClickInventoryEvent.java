package me.thomas.pluginorix.event;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.entity.HumanEntity;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.Arrays;

public class onPlayerClickInventoryEvent implements Listener {

    @EventHandler (priority = EventPriority.NORMAL)

    public void onplayerclickinventory(InventoryClickEvent event) {
        final Inventory inventory = event.getClickedInventory();
        final HumanEntity humanEntity = event.getWhoClicked();
        final World world = humanEntity.getWorld();

        Player player = (Player) event.getWhoClicked();

        if (inventory.getName().equalsIgnoreCase("§5Event et Informations")) {
            event.setCancelled(true);
            if (event.getCurrentItem().getType() == Material.TOTEM) {
                event.setCancelled(true);
                Inventory inventoryInfoTotem = Bukkit.createInventory(null, 5 * 9, "§5Information Totem");
                inventoryInfoTotem.setItem(8+5, getItem(Material.TOTEM, 1, "EVENT Totem 3 fois par semaines !", "mardi, jeudi, samedi", "----------"));
                inventoryInfoTotem.setItem(17+3, getItem(Material.TOTEM, 1, "Objectif :", "detruire les blocs de fer ", "avec votre faction !"));
                inventoryInfoTotem.setItem(17+4, getItem(Material.TOTEM, 1, "Attention !", "lorsque qu'un autre faction casse les blocks", "de fer celui se renitialise !"));
                inventoryInfoTotem.setItem(17+5, getItem(Material.TOTEM, 1, "Comment y allé ?", "utilise la commande /warp pour accédé au menu", "puis clic sur l'île Event !"));
                inventoryInfoTotem.setItem(17+6, getItem(Material.TOTEM, 1, "Ile Event ?", "Lors d'un event tu peux soit aller a celui-ci a pieds", "ou bien y aller en passant dans le portail de l'île Event !"));
                inventoryInfoTotem.setItem(17+7, getItem(Material.TOTEM, 1, "Les portails", "A l'île Event tu a plusieurs portail", "Chaque portail te teleportera à l'event voulut !"));
                player.openInventory(inventoryInfoTotem);
            }
            else if (event.getCurrentItem().getType() == Material.STONE) {
                event.setCancelled(true);
                Inventory inventoryInfoKOTH = Bukkit.createInventory(null, 5 * 9, "§5Information KOTH");
                inventoryInfoKOTH.setItem(8+5, getItem(Material.STONE, 1, "EVENT Totem 3 fois par semaines !", "lundi, mercredi, vendredi", "----------"));
                inventoryInfoKOTH.setItem(17+3, getItem(Material.STONE, 1, "Objectif :", "contrôle une zone ", "avec votre faction !"));
                inventoryInfoKOTH.setItem(17+4, getItem(Material.STONE, 1, "Attention !", "Le PvP est activé !", "IL va falloir se battre !"));
                inventoryInfoKOTH.setItem(17+5, getItem(Material.STONE, 1, "Comment y allé ?", "utilise la commande /warp pour accédé au menu", "puis clic sur l'île Event !"));
                inventoryInfoKOTH.setItem(17+6, getItem(Material.STONE, 1, "Ile Event ?", "Lors d'un event tu peux soit aller a celui-ci a pieds", "ou bien y aller en passant dans le portail de l'île Event !"));
                inventoryInfoKOTH.setItem(17+7, getItem(Material.STONE, 1, "Les portails", "A l'île Event tu a plusieurs portail", "Chaque portail te teleportera à l'event voulut !"));
                inventoryInfoKOTH.setItem(26+5, getItem(Material.STONE, 1, "/!\\Attention !", "Lorsque vous passerez le portail", "Le PvP serra activé !"));
                player.openInventory(inventoryInfoKOTH);
            }

        }

    }
    public ItemStack getItem(Material material, int nombres, String customName, String customList, String customList2) {
        ItemStack it = new ItemStack(material, nombres);
        ItemMeta itMeta = it.getItemMeta();
        itMeta.setDisplayName(customName);
        itMeta.setLore(Arrays.asList(customList, customList2));
        it.setItemMeta(itMeta);

        return it;
    }
}
