package com.epam.LoggingTask;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class App 
{
	private static Logger LOGGER = LogManager.getLogger(App.class);
    public static void main( String[] args )
    {
        Client client = new Client();
    	client.Input();
    	ConstructionEstimation cost = new ConstructionEstimation();
    	cost.Estimation();
    }
}
