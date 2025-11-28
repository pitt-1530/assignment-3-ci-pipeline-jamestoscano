package edu.pitt.se;

import java.util.List;

public class PlaylistRecommender {

    public static String classifyEnergy(List<Integer> bpms) {
        // TODO: Implement classifyEnergy()

        // reject null or empty lists
        if (bpms.isEmpty()) {
            return null;
        }

        int count = 0;
        int avg = 0;
        // find average
        for (int i = 0; i < bpms.size(); i++) {
            avg = avg + bpms.get(i);
            count++;
        }
        avg = avg / count;

        if (avg >= 140) {
            return "HIGH";
        } else if (avg >= 100 && avg <= 139) {
            return "MEDIUM";
        } else if (avg < 100) {
            return "LOW";
        } else {
            return null;
        }
    }

    public static boolean isValidTrackTitle(String title) {
        // TODO: Implement isValidTrackTitle()
        // Checks for alphabetic characters + spaces, 1–30 chars
        // Reject null or special characters

        for (int i = 0; i < title.length(); i++) {
            if (!Character.isAlphabetic(title.charAt(i)) && !Character.isWhitespace(title.charAt(i))) {
                return false;
            }
        }
        return true;

    }

    public static int normalizeVolume(int volumeDb) {
        // TODO: Implement normalizeVolume()
        // Clamp volume into range 0–100 (e.g., 120 -> 100, -10 -> 0)
        if (volumeDb > 100) {
            volumeDb = 100;
        } else if (volumeDb < 0) {
            volumeDb = 0;
        }

        return volumeDb;
    }
}
