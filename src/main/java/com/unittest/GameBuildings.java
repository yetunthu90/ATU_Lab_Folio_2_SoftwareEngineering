package com.unittest;

public final class GameBuildings {
    private GameBuildings() {
        throw new UnsupportedOperationException("Utility class");
    }

    public static String createChannel(String buildingType) {
        if ("House".equalsIgnoreCase(buildingType)) {
            return "You are now in the House.";
        } else if ("Shop".equalsIgnoreCase(buildingType)) {
            return "You are now in the Shop";
        } else if ("Inn".equalsIgnoreCase(buildingType)) {
            return "You are now in the Inn";
        } else {
            return "Building type not recognized. Please specify 'House', 'Shop', or 'Inn'.";
        }
    }

}
