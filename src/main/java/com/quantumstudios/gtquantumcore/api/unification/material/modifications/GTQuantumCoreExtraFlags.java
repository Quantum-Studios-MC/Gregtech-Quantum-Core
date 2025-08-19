package com.quantumstudios.gtquantumcore.api.unification.material.modifications;

import static gregtech.api.unification.material.Materials.*;
import static gregtech.api.unification.material.info.MaterialFlags.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.quantumstudios.gtquantumcore.api.unification.material.info.GTQuantumCoreMaterialFlags;

import gregtech.api.unification.material.Material;
import gregtech.api.unification.material.info.MaterialFlag;
public class GTQuantumCoreExtraFlags {


    public static void setFlags(Material[] materials, MaterialFlag... flags) {
        for (Material material : materials) {
            material.addFlags(flags);
        }
    }

    public static void setFlags(List<Material> materials, MaterialFlag... flags) {
        for (Material material : materials) {
            material.addFlags(flags);
        }
    }

    public static void register() {
        mesh();
        billet();
        shell();
        densewire();
        ntmpipe();
        plateTriple();
        plateSextuple();
        piston();
        hook();
        nanites();
        tablet();
        curvedplate();
        thread();
        yarn();
    }

    private static void mesh() {
        Material[] materials = { RedAlloy, WroughtIron, Iron, Steel, Gold};

        setFlags(materials, GTQuantumCoreMaterialFlags.GENERATE_MESH);
    }

    private static void billet() {
        Material[] materials = { RedAlloy, WroughtIron, Iron, Steel, Gold, Silver, Uranium235};

        setFlags(materials, GTQuantumCoreMaterialFlags.GENERATE_BILLET);
    }

    private static void shell() {
        Material[] materials = { RedAlloy, WroughtIron, Iron, Steel, Gold, Silver, Uranium235};

        setFlags(materials, GTQuantumCoreMaterialFlags.GENERATE_DENSE_WIRE);
    }
    private static void densewire() {
        Material[] materials = { RedAlloy, WroughtIron, Iron, Steel, Gold, Silver, Uranium235};

        setFlags(materials, GTQuantumCoreMaterialFlags.GENERATE_SHELL);
    }

    private static void ntmpipe() {
        Material[] materials = { RedAlloy, WroughtIron, Iron, Steel, Gold, Silver, Uranium235};

        setFlags(materials, GTQuantumCoreMaterialFlags.GENERATE_NTMPIPE);
    }

    private static void plateTriple() {
        Material[] materials = { RedAlloy, WroughtIron, Iron, Steel, Gold, Silver, Uranium235};

        setFlags(materials, GTQuantumCoreMaterialFlags.GENERATE_CAST_PLATE);
    }

    private static void plateSextuple() {
        Material[] materials = { RedAlloy, WroughtIron, Iron, Steel, Gold, Silver, Uranium235};

        setFlags(materials, GTQuantumCoreMaterialFlags.GENERATE_WELDED_PLATE);
    }

    private static void piston() {
        Material[] materials = { RedAlloy, WroughtIron, Iron, Steel, Gold, Silver, Uranium235};

        setFlags(materials, GTQuantumCoreMaterialFlags.GENERATE_PISTON);
    }

    private static void hook() {
        Material[] materials = { RedAlloy, WroughtIron, Iron, Steel, Gold, Silver, Uranium235};
        setFlags(materials, GTQuantumCoreMaterialFlags.GENERATE_HOOK);
    }

    private static void tablet() {
        Material[] materials = { RedAlloy, WroughtIron, Iron, Steel, Gold, Silver, Uranium235};
        setFlags(materials, GTQuantumCoreMaterialFlags.GENERATE_TABLET);
    }

    private static void nanites() {
        Material[] materials = { RedAlloy, WroughtIron, Iron, Steel, Gold, Silver, Uranium235};
        setFlags(materials, GTQuantumCoreMaterialFlags.GENERATE_NANITES);
    }

    private static void curvedplate() {
        Material[] materials = { RedAlloy, WroughtIron, Iron, Steel, Gold, Silver, Uranium235};
        setFlags(materials, GTQuantumCoreMaterialFlags.GENERATE_CURVED_PLATE);
    }

    private static void thread() {
        Material[] materials = { RedAlloy, WroughtIron, Iron, Steel, Gold, Silver, Uranium235};
        setFlags(materials, GTQuantumCoreMaterialFlags.GENERATE_THREAD);
    }

    private static void yarn() {
        Material[] materials = { RedAlloy, WroughtIron, Iron, Steel, Gold, Silver, Uranium235};
        setFlags(materials, GTQuantumCoreMaterialFlags.GENERATE_YARN);
    }

}
