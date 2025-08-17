package com.quantumstudios.gtquantumcore.api.unification.ore;

import static gregtech.api.unification.ore.OrePrefix.Flags.ENABLE_UNIFICATION;

import com.quantumstudios.gtquantumcore.api.unification.material.info.GTQuantumCoreMaterialFlags;
import com.quantumstudios.gtquantumcore.api.unification.material.info.GTQuantumCoreMaterialIconType;
import gregtech.api.unification.ore.OrePrefix;
import static gregtech.api.GTValues.M;

public class GTQuantumCoreOrePrefix {

    public static final OrePrefix mesh = new OrePrefix("mesh", M, null, GTQuantumCoreMaterialIconType.mesh,
            ENABLE_UNIFICATION, mat -> mat.hasFlag(GTQuantumCoreMaterialFlags.GENERATE_MESH));

    public static final OrePrefix billet = new OrePrefix("billet", -1 , null, GTQuantumCoreMaterialIconType.billet,
            ENABLE_UNIFICATION, mat -> mat.hasFlag(GTQuantumCoreMaterialFlags.GENERATE_BILLET));

    public static final OrePrefix wiredense = new OrePrefix("wiredense", M, null, GTQuantumCoreMaterialIconType.wiredense,
            ENABLE_UNIFICATION, mat -> mat.hasFlag(GTQuantumCoreMaterialFlags.GENERATE_DENSE_WIRE));

    public static final OrePrefix ntmpipe = new OrePrefix("ntmpipe", M * 3, null, GTQuantumCoreMaterialIconType.ntmpipe,
            ENABLE_UNIFICATION, mat -> mat.hasFlag(GTQuantumCoreMaterialFlags.GENERATE_NTMPIPE));

    public static final OrePrefix shell = new OrePrefix("shell", M * 4, null, GTQuantumCoreMaterialIconType.shell,
            ENABLE_UNIFICATION, mat -> mat.hasFlag(GTQuantumCoreMaterialFlags.GENERATE_SHELL));

    public static final OrePrefix plateTriple = new OrePrefix("plateTriple", M * 3, null, GTQuantumCoreMaterialIconType.plateWelded,
            ENABLE_UNIFICATION, mat -> mat.hasFlag(GTQuantumCoreMaterialFlags.GENERATE_CAST_PLATE));

    public static final OrePrefix plateSextuple = new OrePrefix("plateSextuple", M * 6, null, GTQuantumCoreMaterialIconType.plateSextuple,
            ENABLE_UNIFICATION, mat -> mat.hasFlag(GTQuantumCoreMaterialFlags.GENERATE_WELDED_PLATE));

}
