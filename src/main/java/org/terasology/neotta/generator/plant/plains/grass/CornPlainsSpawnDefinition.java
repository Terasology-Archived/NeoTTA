// Copyright 2020 The Terasology Foundation
// SPDX-License-Identifier: Apache-2.0
package org.terasology.neotta.generator.plant.plains.grass;

import org.terasology.anotherWorld.AnotherWorldBiomes;
import org.terasology.anotherWorld.decorator.BlockCollectionPredicate;
import org.terasology.anotherWorldPlants.crop.CornGrowthDefinition;
import org.terasology.engine.world.generator.plugin.RegisterPlugin;
import org.terasology.gf.PlantType;
import org.terasology.gf.generator.GrowthBasedPlantSpawnDefinition;
import org.terasology.neotta.generator.Blocks;

import java.util.Arrays;

/**
 * Defines properties of corn plains pertaining to generation.
 */
@RegisterPlugin
public class CornPlainsSpawnDefinition extends GrowthBasedPlantSpawnDefinition {
    public CornPlainsSpawnDefinition() {
        super(PlantType.GRASS, CornGrowthDefinition.ID, AnotherWorldBiomes.PLAINS.getId().toLowerCase(), 0.8f, 0.3f,
                new BlockCollectionPredicate(Arrays.asList(Blocks.getBlock("CoreAssets:Grass"))));
    }
}
