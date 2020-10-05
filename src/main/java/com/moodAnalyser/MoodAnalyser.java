package com.moodAnalyser;

public class MoodAnalyser{
	enum MoodInput{
		Empty,NULL;
	}
	String message;
	public MoodAnalyser(String message) {
		this.message = message;
	}
	public String analyseMood() throws MoodAnalysisException {
		try {
		    if(message.contains("sad")) {
			return "SAD";
		    }
		}
		catch(NullPointerException e) {
			throw new MoodAnalysisException("Invalid mood "+MoodInput.NULL);
		}
		if(message.equals("")) {
			throw new MoodAnalysisException("Invalid mood "+MoodInput.Empty);
		}
		return "HAPPY";
	}	
}
