package edu.pitt.se;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Arrays;
import java.util.List;

public class PlaylistRecommenderTest {

    @Test
    public void classifyEnergy() {
        // See if average bpms is working (137.5 is result)
        assertEquals("MEDIUM", PlaylistRecommender.classifyEnergy(Arrays.asList(100, 200, 120, 130)));
    }

    @Test
    public void isValidTrackTitle() {
        // Special character in title
        assertFalse(PlaylistRecommender.isValidTrackTitle("Bad! Title"));

        // A good title
        assertTrue(PlaylistRecommender.isValidTrackTitle("Test Title"));
    }

    @Test
    public void normalizeVolume() {
        // Over 100
        assertEquals(100, PlaylistRecommender.normalizeVolume(120));

        // Less than 0
        assertEquals(0, PlaylistRecommender.normalizeVolume(-5));

    }

}
