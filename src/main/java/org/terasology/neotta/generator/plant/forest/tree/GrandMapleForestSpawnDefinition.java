// Copyright 2020 The Terasology Foundation
// SPDX-License-Identifier: Apache-2.0
package org.terasology.neotta.generator.plant.forest.tree;

import org.terasology.anotherWorld.AnotherWorldBiomes;
import org.terasology.anotherWorld.decorator.BlockCollectionPredicate;
import org.terasology.anotherWorldPlants.tree.GrandMapleGrowthDefinition;
import org.terasology.engine.world.generator.plugin.RegisterPlugin;
import org.terasology.gf.PlantType;
import org.terasology.gf.generator.GrowthBasedPlantSpawnDefinition;
import org.terasology.neotta.generator.Blocks;

import java.util.Arrays;

/**
 * Defines properties of grand maple forests pertaining to generation.
 */
@RegisterPlugin
public class GrandMapleForestSpawnDefinition extends GrowthBasedPlantSpawnDefinition {
    public GrandMapleForestSpawnDefinition() {
        super(PlantType.TREE, GrandMapleGrowthDefinition.ID, AnotherWorldBiomes.FOREST.getId().toLowerCase(), 0.4f,
                0.6f,
                new BlockCollectionPredicate(Arrays.asList(Blocks.getBlock("CoreAssets:Grass"))));
    }
}
