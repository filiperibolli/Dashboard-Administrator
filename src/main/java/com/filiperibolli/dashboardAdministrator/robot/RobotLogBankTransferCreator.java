package com.filiperibolli.dashboardAdministrator.robot;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;
import java.util.UUID;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

import com.filiperibolli.dashboardAdministrator.model.Account;

@Component
public class RobotLogBankTransferCreator extends TimerTask implements InitializingBean {
 
    private static final int timeLapse = 5000;
	private static final Random random = new Random();
    private static final String logPath = "C:\\Users\\Filipe Ribolli\\Desktop\\Filipe Ribolli"
													+ "\\Estudos\\Estudos Big Data\\Dados\\LogTranferenciasBancoFR\\log_tranferencias.txt";
    private static final String separador = "\t";
    private static final String endLine = "\n";
    
	/**
	 * Executes when the project starts
	 */
    @Override
    public void afterPropertiesSet() throws Exception {
    	//arrow a timer and creates a time interval for running our logging robot
    	Timer timer = new Timer();
    	timer.schedule(new RobotLogBankTransferCreator(), 0, timeLapse);
    }

	/**
	 * Method that represents the robot itself
	 * Create a log line of a bank transaction
	 */
	@Override
	public void run() {

        try {
        	//We create a FileWriter and a BufferedWriter with the logPath
    		FileWriter fileWriter = new FileWriter(logPath, true);
    		BufferedWriter writer = new BufferedWriter(fileWriter);
    		
    		//Now we randomly create a Account with:
    		//Agency number - random range 1 - 20
    		//Account number - random range 1 - 50
    		//Service basket - 3 different types:
    			//Agency number 1 - 10   | type basic : 1
    			//Agency number 11 - 18  | type classic : 2
    			//Agency number 19 - 20  | type premium : 3
    		//Creating a account
    		Account account = new Account((random.nextInt(20) + 1), (random.nextInt(50) + 1));
    		//Start a String transationalLog and add the values
    		String transationalLog = "";
    		//Random UUID for id
    		transationalLog += addLogValue(UUID.randomUUID().toString());
    		//Account settings
    		transationalLog += addLogValue(account.getAgencyNumber());
    		transationalLog += addLogValue(account.getAccountNumber());
    		transationalLog += addLogValue(account.getServiceBasketType());
    		/**
    		 *Additional information for logging accuracy
    		 * */
    		//Transaction value range 1 - 100000 | with 2 decimal places
    			//Exemple: 10000 == 100.00
    		transationalLog += addLogValue((random.nextInt(100000) + 1));
    		//Balance after transaction
    		transationalLog += addLogValue((random.nextInt(1000000) + 1));
    		//Midia
    		transationalLog += addLogValue((random.nextInt(3) + 1));
    		//Security device
    		transationalLog += addLogValue((random.nextInt(5) + 1));
    		//holder
    		transationalLog += addLogValue((random.nextInt(2) + 1));
    		//Pessoa fisica ou juridica
    		transationalLog += addLogValue((random.nextInt(2) + 1));
    		//End
			transationalLog += endLine;
			//Writing and closing
	        writer.write(transationalLog);
	        writer.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	/**
	 * Concatenate the log line
	 */
	public String addLogValue(Object value) {
		return value + separador;
	}
}