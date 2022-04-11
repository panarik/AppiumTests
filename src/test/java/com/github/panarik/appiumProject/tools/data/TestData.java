package com.github.panarik.appiumProject.tools.data;

import java.util.List;
import java.util.Map;

public class TestData {

    public List<Map<String, String>> platforms; // Android and iOS platform settings.

    public Map<String, String> getSettings(String platformName) {
        return switch (platformName) {
            case ("ANDROID") -> platforms.get(0);
            case ("iOS") -> platforms.get(1);
            default -> null;
        };
    }

    public Map<String, String> getAndroid() {
        return platforms.get(0);
    }

    public Map<String, String> getIOS() {
        return platforms.get(1);
    }
}
