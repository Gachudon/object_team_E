package com.util;

/**
 * Class that contains global variables.
 */
public class GlobalVariables {
    public static final String DRIVER = "com.mysql.cj.jdbc.Driver";
    public static final String URL = "jdbc:mysql://localhost:9991/world?useSSL=false&allowPublicKeyRetrieval=true&serverTimezone=UTC";
    public static final String ID = "scott";
    public static final String PASSWORD = "oraCLE!(c";
    public static final String USER_LIST_QUERY = "SELECT id, password, name, _rank FROM user";
    public static final String PARTTIME_QUERY = "SELECT role from employee where id = ?";
    public static final String FULLTIME_QUERY = "SELECT role, department from employee where id = ?";
    public static final String SCHEDULE_MANAGER_LIST_QUERY = "SELECT id, name, alarm FROM schedule ORDER BY name"; 
    public static final String CONFERENCE_MANAGER_LIST_QUERY = "SELECT id, name FROM conference ORDER BY name";
    public static final String JOB_MANAGER_LIST_QUERY = "SELECT id, name FROM job ORDER BY name";
} 
