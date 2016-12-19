package com.example.mason.taskmap_of_legends;


import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

/**
 * Created by mason on 12/18/16.
 */

public class TaskNode implements iDataItem {

    //TODO fill these in
    //these are virtual fields
    //private static final String[] fieldNames = {};
    //private static final String[] fieldTypes = {};
    private static final HashMap<String, String> nameTypeDict;

    //todo verify this is done
    static{
        nameTypeDict = new HashMap<>(20);
        TaskNode node = new TaskNode();
        Field[] testFields = node.getClass().getDeclaredFields();
        ArrayList<String> als = new ArrayList<>(20);
        for (Field field : testFields) {
            nameTypeDict.put(field.getName(), field.getType().getSimpleName());
        }
        //nameTypeDict.put(java.lang.reflect.AnnotatedElement)
    }

    private Integer taskIdNo;
    private String taskNickName;
    private ArrayList<TaskNode> thisDependsOnList;
    private ArrayList<TaskNode> dependsOnThisList;
    private Boolean isCompleted;
    private Boolean isRecurring;
    private Integer recurringIdNo;
    private Date startDate;
    public void s(){
//        startDate.setTime(java.lang.D)
    }

    @Override
    public HashMap<String, String> getFieldNameAndTypeDict() {
        return nameTypeDict;
    }
    public HashMap<String, String> getNameTypeDict(){return nameTypeDict;}


    @Override
    public String[] getFieldNames() {
        return (String[]) nameTypeDict.keySet().toArray();
    }

    @Override
    public String[] getFieldTypes() {
        return (String[]) nameTypeDict.values().toArray();
    }

    public Integer getTaskIdNo() {
        return taskIdNo;
    }

    public void setTaskIdNo(Integer taskIdNo) {
        this.taskIdNo = taskIdNo;
    }

    public String getTaskNickName() {
        return taskNickName;
    }

    public void setTaskNickName(String taskNickName) {
        this.taskNickName = taskNickName;
    }

    public ArrayList<TaskNode> getThisDependsOnList() {
        return thisDependsOnList;
    }

    public void setThisDependsOnList(ArrayList<TaskNode> thisDependsOnList) {
        this.thisDependsOnList = thisDependsOnList;
    }


    public ArrayList<TaskNode> getDependsOnThisList() {
        return dependsOnThisList;
    }

    public void setDependsOnThisList(ArrayList<TaskNode> dependsOnThisList) {
        this.dependsOnThisList = dependsOnThisList;
    }

    public Boolean isCompleted() {
        return isCompleted;
    }

    public void setCompleted(Boolean completed) {
        isCompleted = completed;
    }

    public Boolean isRecurring() {
        return isRecurring;
    }

    public void setRecurring(Boolean recurring) {
        isRecurring = recurring;
    }

    public Integer getRecurringIdNo() {
        return recurringIdNo;
    }

    public void setRecurringIdNo(Integer recurringIdNo) {
        this.recurringIdNo = recurringIdNo;
    }
}
