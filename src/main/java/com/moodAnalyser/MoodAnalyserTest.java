package com.moodAnalyser;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

class MoodAnalyserTest {
		@Test
		void givenMessage_whenSad_thenReturnSadMood() {
			MoodAnalyser moodAnalyser = new MoodAnalyser("I am in sad mood");
			try {
			    moodAnalyser.analyseMood();
			}
			catch(MoodAnalysisException e) {
			    e.printStackTrace();
			}
			
		}
		@Test
		void givenMessage_whenAny_thenReturnSadMood() {
			MoodAnalyser moodAnalyser = new MoodAnalyser("I am in happy mood");
			try {
			    moodAnalyser.analyseMood();
			}
			catch(MoodAnalysisException e) {
			    e.printStackTrace();
			}
		}
		@Test 
		void givenNull_shouldThrowException() {
			MoodAnalyser moodAnalyser = new MoodAnalyser(null);
			try {
			    moodAnalyser.analyseMood();
			}
			catch(MoodAnalysisException e) {
			    System.out.println(e);
			}
		}
		@Test
		void givenEmpty_shouldThrowException() {
			MoodAnalyser moodAnalyser = new MoodAnalyser("");
			try {
			    moodAnalyser.analyseMood();
			}
			catch(MoodAnalysisException e) {
			    System.out.println(e);
			}
		}
		
}
