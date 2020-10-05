package com.moodAnalyser;
import java.util.stream.Stream;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class MoodAnalyserTest {
		@Test
		void givenMessage_whenSad_thenReturnSadMood() {
			MoodAnalyser moodAnalyser = new MoodAnalyser();
			Assert.assertEquals("SAD", moodAnalyser.analyseMood("I am in sad mood"));
		}
		@Test
		void givenMessage_whenAny_thenReturnSadMood() {
			MoodAnalyser moodAnalyser = new MoodAnalyser();
			Assert.assertEquals("HAPPY", moodAnalyser.analyseMood("I am in any mood"));
		}
}
