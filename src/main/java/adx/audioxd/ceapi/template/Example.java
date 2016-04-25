package adx.audioxd.ceapi.template;


import adx.audioxd.customenchantmentapi.enchantment.Enchantment;
import adx.audioxd.customenchantmentapi.enchantment.event.EnchantmentEventHandler;
import adx.audioxd.customenchantmentapi.enums.ItemType;
import adx.audioxd.customenchantmentapi.events.damage.EOwnerDamagedEvent;
import org.bukkit.ChatColor;

public class Example extends Enchantment {
	public Example() {
		super(ChatColor.BOLD + "Example", ItemType.ALL_OFF_THE_ABOVE, 10);
	}

	@EnchantmentEventHandler
	public void onHit(EOwnerDamagedEvent event) {
		event.setDamage(0);
		event.setCancelled(true);
	}
}
