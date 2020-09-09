// Copyright 2020 The Terasology Foundation
// SPDX-License-Identifier: Apache-2.0
package org.terasology.neotta.generator.plant.plains.tree;

import org.terasology.anotherWorld.AnotherWorldBiomes;
import org.terasology.anotherWorld.decorator.BlockCollectionPredicate;
import org.terasology.anotherWorldPlants.tree.OakGrowthDefinition;
import org.terasology.engine.world.generator.plugin.RegisterPlugin;
import org.terasology.gf.PlantType;
import org.terasology.gf.generator.GrowthBasedPlantSpawnDefinition;
import org.terasology.neotta.generator.Blocks;

import java.util.Arrays;

/**
 * Defines properties of oak tree plains pertaining to generation.
 */
@RegisterPlugin
public class OakPlainsSpawnDefinition extends GrowthBasedPlantSpawnDefinition {
    public OakPlainsSpawnDefinition() {
        super(PlantType.TREE, OakGrowthDefinition.ID, AnotherWorldBiomes.PLAINS.getId().toLowerCase(), 0.6f, 0.2f,
                new BlockCollectionPredicate(Arrays.asList(Blocks.getBlock("CoreAssets:Grass"))));
    }
}
