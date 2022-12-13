package Partie2;

import java.util.ArrayList;
import java.util.List;

public class journalisation {
	
    private static journalisation instanceJournalisation = null;
    
    private static ArrayList<String> tabLogs = new ArrayList<>();
	
	private journalisation(){}

    public static journalisation getJournalisation() {
    	if(instanceJournalisation == null) {
    		instanceJournalisation = new journalisation();
        }
        return instanceJournalisation;
    }
    
    public static void ajouterLog(String unLog) {
    	tabLogs.add(unLog);
    }
    
    public static List<String> getLogs() {
    	return tabLogs;
    }

}
