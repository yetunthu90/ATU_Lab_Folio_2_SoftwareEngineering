package com.unittest;

import org.junit.jupiter.api.Test;  // Third-party imports second

import static org.junit.jupiter.api.Assertions.assertEquals;  // Static imports first

public class KorokSeedGuideTest {

    @Test
    void testFindKorokSeed_SuperField() {
        String result = KorokSeedGuide.findKorokSeed("Super Field");
        assertEquals("There are Korok Seeds near the big trees.", result);
    }

    @Test
    void testFindKorokSeed_UnknownRegion() {
        String result = KorokSeedGuide.findKorokSeed("Unknown Region");
        assertEquals("Explore the area to find Korok Seeds!", result);
    }

    @Test
    void testFindKorokSeed_CaseInsensitive() {
        String result = KorokSeedGuide.findKorokSeed("super field");
        assertEquals("There are Korok Seeds near the big trees.", result);
    }
}
