package com.agri.AGRIBOT;

public class CropInfo {
	
	    private int id;
	    private String cropName;
	    private String questionPattern;
	    private String answer;

	    public CropInfo(int id, String cropName, String questionPattern, String answer) {
	        this.id = id;
	        this.cropName = cropName;
	        this.questionPattern = questionPattern;
	        this.answer = answer;
	    }

	    public String getAnswer() { return answer; }
	}


