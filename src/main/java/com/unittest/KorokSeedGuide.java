
package com.unittest;

public final class KorokSeedGuide {
    private KorokSeedGuide() {
        throw new UnsupportedOperationException("Utility class");
    }

    public static String findKorokSeed(String region) {
        if ("Super Field".equalsIgnoreCase(region)) {
            return "There are Korok Seeds near the big trees.";
        } else {
            return "Explore the area to find Korok Seeds!";
        }
    }
}
