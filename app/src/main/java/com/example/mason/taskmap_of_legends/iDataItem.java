package com.example.mason.taskmap_of_legends;

import java.util.HashMap;

/**
 * Created by mason on 12/18/16.
 */

public interface iDataItem {

    HashMap<String, String> getFieldNameAndTypeDict();
    String[] getFieldNames();
    String[] getFieldTypes();

}
