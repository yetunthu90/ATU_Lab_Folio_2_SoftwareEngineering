package com.unittest;

import org.junit.jupiter.api.Test;  // Third-party imports second

import static org.junit.jupiter.api.Assertions.assertEquals;  // Static imports first

public class GameBuildingsTest {

    @Test
    void testCreateChannel_House() {
        String result = GameBuildings.createChannel("House");
        assertEquals("You are now in the House.", result);
    }

    @Test
    void testCreateChannel_Shop() {
        String result = GameBuildings.createChannel("Shop");
        assertEquals("You are now in the Shop", result);
    }

    @Test
    void testCreateChannel_Inn() {
        String result = GameBuildings.createChannel("Inn");
        assertEquals("You are now in the Inn", result);
    }

    @Test
    void testCreateChannel_UnknownBuildingType() {
        String result = GameBuildings.createChannel("Farm");
        assertEquals("Building type not recognized. Please specify 'House', 'Shop', or 'Inn'.", result);
    }

}
