package com.moodAnalyser;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

class MoodAnalyserTest {
		@Test
		void givenMessage_whenSad_thenReturnSadMood() {
			MoodAnalyser moodAnalyser = new MoodAnalyser("I am in sad mood");
			Assert.assertEquals("SAD", moodAnalyser.analyseMood());
		}
		@Test
		void givenMessage_whenAny_thenReturnSadMood() {
			MoodAnalyser moodAnalyser = new MoodAnalyser("I am in happy mood");
			Assert.assertEquals("HAPPY", moodAnalyser.analyseMood());
		}
}
