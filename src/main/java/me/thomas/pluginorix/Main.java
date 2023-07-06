package me.thomas.pluginorix;
import java.util.Arrays;
import java.util.Random;
import me.thomas.pluginorix.commands.*;
import me.thomas.pluginorix.event.*;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.plugin.java.JavaPlugin;

import net.md_5.bungee.api.ChatColor;
import org.bukkit.scheduler.BukkitRunnable;

public class Main extends JavaPlugin{

    private final BlockBreakHandler blockBreakHandler = new BlockBreakHandler();

    private final BlockBreakHandlerPierro blockBreakHandlerPierro = new BlockBreakHandlerPierro();

    private final EpeeStrikeLightning epeestrikeLightning = new EpeeStrikeLightning();

    @Override
    public void onEnable() {

        BlockOrixRecipe();
        EpeeDondenneRecipe();
        BlockmzRecipe();
        getCommand("discord").setExecutor(new Commands_discord());
        getCommand("site").setExecutor(new Commands_site());
        getCommand("zinga").setExecutor(new Commands_zinga());
        getCommand("dondenne").setExecutor(new Commands_dondenne());
        getCommand("mz").setExecutor(new commands_mz());
        getCommand("pc").setExecutor(new commands_pc());
        getCommand("event").setExecutor(new commands_event());
        getServer().getPluginManager().registerEvents(blockBreakHandler, this);
        getServer().getPluginManager().registerEvents(blockBreakHandlerPierro, this);
        getServer().getPluginManager().registerEvents(epeestrikeLightning, this);
        getServer().getPluginManager().registerEvents(new onPlayerClickInventory(), this);
        getServer().getPluginManager().registerEvents(new onPlayerClickInventoryEvent(), this);
        getServer().getPluginManager().registerEvents(new onPlayerClickInventoryWarp(), this);

        getCommand("hammer").setExecutor(new GiveHammerCommand());
        getCommand("hammerp").setExecutor(new GiveHammerCommandPierro());
        getCommand("minage").setExecutor(new commands_minage());
        getCommand("minagetp").setExecutor(new commands_minagetp());
        getCommand("warp").setExecutor(new commands_warp());
        getCommand("leveltree").setExecutor(new commands_levelTree());
        getCommand("resetminage").setExecutor(new commands_resetMinage());

        //message automatique

        String[] messagesAuto = {"§5Utilise la commande §b/discord §5pour être au courant des évenements !","§5Utilise la commande §b/site §5 pour nous rejoindres !","§5Utilise la commande §b/tuto §5pour affiné tes connaisance ou en apprendre de nouveau !", "Soutiens le serveur en votant pour nous ! Utilise la commanddes /vote pour plus d'info"};

        Bukkit.getScheduler().runTaskTimer(this, new BukkitRunnable() {
            @Override
            public void run() {
                Bukkit.broadcastMessage(messagesAuto[new Random().nextInt(messagesAuto.length)]);
            }
        }, 0, 20*60*16);
        //reload minage

        Bukkit.getScheduler().runTaskTimer(this, new BukkitRunnable() {
            @Override
            public void run() {
                Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "mrl reset minage");
                Bukkit.broadcastMessage("§5Le monde minage a été reset !");

                }
            }, 0, 20*60*120);
        }


        // items personalisés :

        //Block D'Orix
        //ItemStack BlockOrix = new ItemStack(Material.EMERALD_BLOCK,1);
        //ItemMeta BlockOrixMeta = BlockOrix.getItemMeta();
        //BlockOrixMeta.addEnchant(Enchantment.DURABILITY, 1, true);
        //BlockOrixMeta.setDisplayName(ChatColor.DARK_PURPLE + "" + ChatColor.BOLD + "Block D'Orix");
        //BlockOrix.setItemMeta(BlockOrixMeta);

        //craft block d'orix
        //ShapedRecipe recipe = new ShapedRecipe(new NamespacedKey(this, "Block D'Orix"), BlockOrix);
        //recipe.shape("EDE","DED","EDE");
        //recipe.setIngredient('D', Material.DIAMOND_BLOCK);
        //recipe.setIngredient('E', Material.EMERALD_BLOCK);

        //Epée de Zinga
        //ItemStack EpeeZinga = new ItemStack(Material.DIAMOND_SWORD, 1);
        //ItemMeta EpeeZingaMeta = EpeeZinga.getItemMeta();
        //EpeeZingaMeta.addEnchant(Enchantment.DAMAGE_ALL, 6, true);
        //EpeeZingaMeta.setDisplayName(ChatColor.DARK_PURPLE + "" + ChatColor.BOLD + "Epée de Zinga");
        //EpeeZingaMeta.setLore(Arrays.asList("Epée Legendaire","que la foudre s'abatte !"));
        //EpeeZinga.setItemMeta(EpeeZingaMeta);

        //craft epee de zinga
        //ShapedRecipe EpeeZingarecipe = new ShapedRecipe(new NamespacedKey(this, "Epée de Zinga"), EpeeZinga);
        //EpeeZingarecipe.shape("EEE","ESE","EEE");
        //EpeeZingarecipe.setIngredient('S', Material.DIAMOND_SWORD);
        //EpeeZingarecipe.setIngredient('E', new RecipeChoice(BlockOrix));


        //Epée farm de Dondenne
        //ItemStack EpeeDondenne = new ItemStack(Material.DIAMOND_SWORD, 1);
        //ItemMeta EpeeDondenneMeta = EpeeDondenne.getItemMeta();
        //EpeeDondenneMeta.addEnchant(Enchantment.DAMAGE_ALL, 2, true);
        //EpeeDondenneMeta.addEnchant(Enchantment.DURABILITY, 6, true);
        //EpeeDondenneMeta.addEnchant(Enchantment.DEPTH_STRIDER, 6, true);
        //EpeeDondenneMeta.addEnchant(Enchantment.LOOT_BONUS_MOBS, 5, true);
        //EpeeDondenneMeta.addEnchant(Enchantment.MENDING, 1, true);
        //EpeeDondenneMeta.addEnchant(Enchantment.DAMAGE_ARTHROPODS, 6, true);
        //EpeeDondenneMeta.setDisplayName(ChatColor.DARK_PURPLE + "" + ChatColor.BOLD + "Epée farm de Dondenne");

        //craft epee dondenne
        //ShapedRecipe CraftEpeeDondennerecipe = new ShapedRecipe(new NamespacedKey(this, "Epée farm de Dondenne"), EpeeDondenne);
        //CraftEpeeDondennerecipe.shape("EEE","EDE","EEE");
        //CraftEpeeDondennerecipe.setIngredient('D', Material.DIAMOND_SWORD);
        //CraftEpeeDondennerecipe.setIngredient('E', Material.EMERALD_BLOCK);

        //Bukkit.addRecipe(recipe);
        //	Bukkit.addRecipe(CraftEpeeDondennerecipe);

    public void BlockOrixRecipe() {
        ItemStack BlockOrix = new ItemStack(Material.EMERALD_BLOCK);
        ItemMeta meta = BlockOrix.getItemMeta();
        meta.setDisplayName(ChatColor.DARK_PURPLE + "" + ChatColor.BOLD + "Block D'Orix");
        meta.setLore(Arrays.asList("Block Légendaire D'orix"));
        meta.addEnchant(Enchantment.DURABILITY, 1, true);
        BlockOrix.setItemMeta(meta);
        ShapedRecipe shapedRecipe = new ShapedRecipe(BlockOrix);
        shapedRecipe.shape("EDE","DED","EDE");
        shapedRecipe.setIngredient('E', Material.EMERALD_BLOCK);
        shapedRecipe.setIngredient('D', Material.DIAMOND_BLOCK);
        getServer().addRecipe(shapedRecipe);

    }
    public void BlockmzRecipe() {
        ItemStack Blockmz = new ItemStack(Material.IRON_BLOCK);
        ItemMeta meta = Blockmz.getItemMeta();
        meta.setDisplayName(ChatColor.DARK_PURPLE + "" + ChatColor.BOLD + "Block D'Mz");
        meta.setLore(Arrays.asList("Block Légendaire D'Mz"));
        meta.addEnchant(Enchantment.DURABILITY, 1, true);
        Blockmz.setItemMeta(meta);
        ShapedRecipe shapedRecipe = new ShapedRecipe(Blockmz);
        shapedRecipe.shape("OOO", "OIO", "OOO");
        shapedRecipe.setIngredient('I', Material.IRON_BLOCK);
        shapedRecipe.setIngredient('O', Material.EMERALD_BLOCK); // getMaterial(ChatColor.DARK_PURPLE + "" + ChatColor.BOLD + "Block D'Orix")
        getServer().addRecipe(shapedRecipe);
    }

    public void EpeeDondenneRecipe() {

        ItemStack EpeeDondenne = new ItemStack(Material.DIAMOND_SWORD);
        ItemMeta meta = EpeeDondenne.getItemMeta();
        meta.setDisplayName(ChatColor.DARK_PURPLE + "" + ChatColor.BOLD + "Epée de Farm Dondenne");
        meta.setLore(Arrays.asList("Epée Farm de L'excellence"));
        meta.addEnchant(Enchantment.DURABILITY, 5, true);
        meta.addEnchant(Enchantment.DAMAGE_ARTHROPODS, 6, true);
        meta.addEnchant(Enchantment.MENDING, 1, true);
        meta.addEnchant(Enchantment.LOOT_BONUS_MOBS, 3, true);
        EpeeDondenne.setItemMeta(meta);
        ShapedRecipe shapedRecipe = new ShapedRecipe(EpeeDondenne);
        shapedRecipe.shape("EEE","EDE","EEE");
        shapedRecipe.setIngredient('E', Material.EMERALD_BLOCK);
        shapedRecipe.setIngredient('D', Material.DIAMOND_SWORD);
        getServer().addRecipe(shapedRecipe);

    }

}
