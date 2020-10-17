package com.example.constant;

public class GlobalConstant {
	public static final Integer SUCCESS = 0;
    public static final Integer FAIL = 1;
    
    public interface Message{
    	String SUCCESS_MESSAGE="SUCCESSFUL ";
    	String FAIL_MESSAGE = "FAIL";
    }


  public interface FolderLocation {

        Integer LOCATION_NRC = 1;
        Integer LOCATION_PROFILE = 2;
     

    }

    public interface FolderName {


        String FOLDER_ROOT = "upload";
        String  NRC = "NRC";
        String  PROFILE = "PROFILE";
        String FOLDER_OTHER = "other";

    }
}
