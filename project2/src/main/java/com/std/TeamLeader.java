package com.std;

public class TeamLeader extends FullTime {    
    public TeamLeader(String role, String dept) {
        super(role, dept);
    }

    public void modifyRecord() {
        /*implement*/
    }   

    /**
     * Registers a specific record to an users' specific record manager whose id is <code>id</code>.
     * @param id an id of user whose specific record manager to which its specific recorded is registered
     * @param args arguments used to initialize a specific recorded 
     * @return 0 if succeeds, otherwise, -1
     */
    public int registerRecordTo(String id, String[] args) {
        return manager.registerTo(id, args);
    }

    /**
     * Deletes a specific record to an users' specific record manager whose id is <code>id</code>.
     * @param id an id of user whose specific record manager to which its specific recorded is deleted
     * @param i an index of the recorded to delete
     * @return 0 if succeeds, otherwise, -1
     */
    public int deleteRecordFrom(String id, int i) {
        return manager.deleteFrom(id, i);
    }

    public void manageUser() {
        /*implement*/
    }
}
