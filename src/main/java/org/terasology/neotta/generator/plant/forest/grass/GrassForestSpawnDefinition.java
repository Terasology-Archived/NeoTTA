// Copyright 2020 The Terasology Foundation
// SPDX-License-Identifier: Apache-2.0
package org.terasology.neotta.generator.plant.forest.grass;

import com.google.common.base.Predicate;
import org.terasology.anotherWorld.AnotherWorldBiomes;
import org.terasology.anotherWorld.LocalParameters;
import org.terasology.anotherWorld.decorator.BlockCollectionPredicate;
import org.terasology.engine.world.block.BlockUri;
import org.terasology.engine.world.generator.plugin.RegisterPlugin;
import org.terasology.gf.PlantType;
import org.terasology.gf.generator.StaticBlockFloraSpawnDefinition;
import org.terasology.neotta.generator.Blocks;

import java.util.Arrays;

/**
 * Defines the basic properties of grass forests pertaining to generation.
 */
@RegisterPlugin
public class GrassForestSpawnDefinition extends StaticBlockFloraSpawnDefinition {
    public GrassForestSpawnDefinition() {
        super(PlantType.GRASS, AnotherWorldBiomes.FOREST.getId().toLowerCase(), 1f, 0.7f, "CoreAssets:TallGrass",
                Arrays.asList(new BlockUri("CoreAssets:TallGrass1"), new BlockUri("CoreAssets:TallGrass2"),
                        new BlockUri("CoreAssets:TallGrass3")),
                new BlockCollectionPredicate(Blocks.getBlock("CoreAssets:Grass")),
                new Predicate<LocalParameters>() {
                    @Override
                    public boolean apply(LocalParameters input) {
                        return input.getHumidity() > 0.2f && input.getHumidity() < 0.8f
                                && input.getTemperature() > 0.3 && input.getTemperature() < 0.7f;
                    }
                });
    }
}
