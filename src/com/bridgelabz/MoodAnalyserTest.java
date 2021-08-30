package com.bridgelabz;

import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyserTest {
    MoodAnalyser moodAnalyser = new MoodAnalyser();

    //Method to test if the mood is sad
    @Test
    public void whenTestedMood_ifSad_shouldReturnSad() {
        String mood = moodAnalyser.analyseMood("Iam sad");
        Assert.assertEquals("sad",mood);
    }

    //Method to test if the mood is happy
    @Test
    public void whenTestedMood_ifHappy_shouldReturnHappy() {
        String mood = moodAnalyser.analyseMood("Happy Days");
        Assert.assertEquals("Happy",mood);
    }

    //Method to test if the no mood is given
    @Test
    public void whenTestedMood_ifNotInAnyMood_shouldReturnHappy() {
        String mood = moodAnalyser.analyseMood("Iam not in a mood");
        Assert.assertEquals("Happy",mood);
    }
}
