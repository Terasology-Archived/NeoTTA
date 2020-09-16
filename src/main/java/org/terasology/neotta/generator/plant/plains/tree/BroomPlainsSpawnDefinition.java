// Copyright 2020 The Terasology Foundation
// SPDX-License-Identifier: Apache-2.0
package org.terasology.neotta.generator.plant.plains.tree;

import org.terasology.anotherWorld.AnotherWorldBiomes;
import org.terasology.anotherWorld.decorator.BlockCollectionPredicate;
import org.terasology.anotherWorldPlants.tree.BroomGrowthDefinition;
import org.terasology.engine.world.generator.plugin.RegisterPlugin;
import org.terasology.growingflora.PlantType;
import org.terasology.growingflora.generator.GrowthBasedPlantSpawnDefinition;
import org.terasology.neotta.generator.Blocks;

import java.util.Arrays;

/**
 * Defines properties of broom tree plains pertaining to generation.
 */
@RegisterPlugin
public class BroomPlainsSpawnDefinition extends GrowthBasedPlantSpawnDefinition {
    public BroomPlainsSpawnDefinition() {
        super(PlantType.TREE, BroomGrowthDefinition.ID, AnotherWorldBiomes.PLAINS.getId().toLowerCase(), 0.6f, 0.3f,
                new BlockCollectionPredicate(Arrays.asList(Blocks.getBlock("CoreAssets:Grass"))));
    }
}
