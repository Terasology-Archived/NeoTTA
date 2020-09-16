// Copyright 2020 The Terasology Foundation
// SPDX-License-Identifier: Apache-2.0
package org.terasology.neotta.generator.plant.forest.tree;

import org.terasology.anotherWorld.AnotherWorldBiomes;
import org.terasology.anotherWorld.decorator.BlockCollectionPredicate;
import org.terasology.anotherWorldPlants.tree.OakGrowthDefinition;
import org.terasology.engine.world.generator.plugin.RegisterPlugin;
import org.terasology.growingflora.PlantType;
import org.terasology.growingflora.generator.GrowthBasedPlantSpawnDefinition;
import org.terasology.neotta.generator.Blocks;

import java.util.Arrays;

/**
 * Defines properties of oak forests pertaining to generation.
 */
@RegisterPlugin
public class OakForestSpawnDefinition extends GrowthBasedPlantSpawnDefinition {
    public OakForestSpawnDefinition() {
        super(PlantType.TREE, OakGrowthDefinition.ID, AnotherWorldBiomes.FOREST.getId().toLowerCase(), 1f, 0.8f,
                new BlockCollectionPredicate(Arrays.asList(Blocks.getBlock("CoreAssets:Grass"))));
    }
}
