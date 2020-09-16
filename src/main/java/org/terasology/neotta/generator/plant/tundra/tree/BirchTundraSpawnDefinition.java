// Copyright 2020 The Terasology Foundation
// SPDX-License-Identifier: Apache-2.0
package org.terasology.neotta.generator.plant.tundra.tree;

import org.terasology.anotherWorld.AnotherWorldBiomes;
import org.terasology.anotherWorld.decorator.BlockCollectionPredicate;
import org.terasology.anotherWorldPlants.tree.BirchGrowthDefinition;
import org.terasology.engine.world.generator.plugin.RegisterPlugin;
import org.terasology.growingflora.PlantType;
import org.terasology.growingflora.generator.GrowthBasedPlantSpawnDefinition;
import org.terasology.neotta.generator.Blocks;

import java.util.Arrays;

/**
 * Defines properties of birch trees in tundra regions pertaining to generation.
 */
@RegisterPlugin
public class BirchTundraSpawnDefinition extends GrowthBasedPlantSpawnDefinition {
    public BirchTundraSpawnDefinition() {
        super(PlantType.TREE, BirchGrowthDefinition.ID, AnotherWorldBiomes.TUNDRA.getId().toLowerCase(), 0.3f, 0.6f,
                new BlockCollectionPredicate(Arrays.asList(Blocks.getBlock("CoreAssets:Snow"))));
    }
}
