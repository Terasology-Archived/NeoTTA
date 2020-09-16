// Copyright 2020 The Terasology Foundation
// SPDX-License-Identifier: Apache-2.0
package org.terasology.neotta.generator.plant.tundra.tree;

import org.terasology.anotherWorld.AnotherWorldBiomes;
import org.terasology.anotherWorld.decorator.BlockCollectionPredicate;
import org.terasology.anotherWorldPlants.tree.SpruceGrowthDefinition;
import org.terasology.engine.world.generator.plugin.RegisterPlugin;
import org.terasology.growingflora.PlantType;
import org.terasology.growingflora.generator.GrowthBasedPlantSpawnDefinition;
import org.terasology.neotta.generator.Blocks;

import java.util.Arrays;

/**
 * Defines properties of spruce trees in tundra regions pertaining to generation.
 */
@RegisterPlugin
public class SpruceTundraSpawnDefinition extends GrowthBasedPlantSpawnDefinition {
    public SpruceTundraSpawnDefinition() {
        super(PlantType.TREE, SpruceGrowthDefinition.ID, AnotherWorldBiomes.TUNDRA.getId().toLowerCase(), 0.9f, 0.6f,
                new BlockCollectionPredicate(Arrays.asList(Blocks.getBlock("CoreAssets:Snow"))));
    }
}
