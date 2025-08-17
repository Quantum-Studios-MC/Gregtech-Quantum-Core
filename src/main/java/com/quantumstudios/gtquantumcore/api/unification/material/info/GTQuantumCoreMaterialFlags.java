package com.quantumstudios.gtquantumcore.api.unification.material.info;

import gregtech.api.unification.material.info.MaterialFlag;
import gregtech.api.unification.material.properties.PropertyKey;

public class GTQuantumCoreMaterialFlags {
    public static final MaterialFlag GENERATE_MESH = new MaterialFlag.Builder("generate_mesh")
            .requireProps(PropertyKey.INGOT)
            .build();

    public static final MaterialFlag GENERATE_BILLET = new MaterialFlag.Builder("generate_billet")
            .requireProps(PropertyKey.INGOT)
            .build();

    public static final MaterialFlag GENERATE_SHELL = new MaterialFlag.Builder("generate_shell")
            .requireProps(PropertyKey.INGOT)
            .build();

    public static final MaterialFlag GENERATE_NTMPIPE = new MaterialFlag.Builder("generate_ntmpipe")
            .requireProps(PropertyKey.INGOT)
            .build();

    public static final MaterialFlag GENERATE_DENSE_WIRE = new MaterialFlag.Builder("generate_dense_wire")
            .requireProps(PropertyKey.INGOT)
            .build();

    public static final MaterialFlag GENERATE_CAST_PLATE = new MaterialFlag.Builder("generate_cast_plate")
            .requireProps(PropertyKey.INGOT)
            .build();

    public static final MaterialFlag GENERATE_WELDED_PLATE = new MaterialFlag.Builder("generate_welded_plate")
            .requireProps(PropertyKey.INGOT)
            .build();
}
