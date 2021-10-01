package net.mcreator.yugmod.procedures;

import net.minecraft.world.IWorld;
import net.minecraft.util.math.BlockPos;

import net.mcreator.yugmod.block.YugportalblockBlock;
import net.mcreator.yugmod.YugmodMod;

import java.util.Map;

public class YugEntityDiesProcedure {
	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				YugmodMod.LOGGER.warn("Failed to load dependency x for procedure YugEntityDies!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				YugmodMod.LOGGER.warn("Failed to load dependency y for procedure YugEntityDies!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				YugmodMod.LOGGER.warn("Failed to load dependency z for procedure YugEntityDies!");
			return;
		}
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				YugmodMod.LOGGER.warn("Failed to load dependency world for procedure YugEntityDies!");
			return;
		}
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		IWorld world = (IWorld) dependencies.get("world");
		world.setBlockState(new BlockPos((int) x, (int) y, (int) z), YugportalblockBlock.block.getDefaultState(), 3);
	}
}
