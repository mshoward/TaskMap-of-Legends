#Design

###Model

####Task Data Structure
- Data
  - Data Fields
    - taskIdNo - Task Identification Number - Long Integer, unique
    - taskNickName - Task NickName - String
    - thisDependsOnList - Task Children - Collection of Task References
      - the task being completed implies this list is completed, recursively
    - dependsOnThis - Task Parents - Collection of Task References
      - Any one of those being completed implies this task is completed
    - isCompleted - Completion State - Boolean
    - isRecurring - Recurrence State - Boolean
    - recurringIdNo - Recurrence Identification Number
    - startDate - Task Start Date - DateTime
    - dueDate - Task Expected End Date - DateTime
    - endDate - Task Actual End Date - DateTime
  - Meta Data
    - fieldNames - Data Field Names - String[]
    - fieldTypes - Field Data Types - String[]
    - todo - cont.

####TaskGraph

- Data
  - Data Fields
    - root - Root Level Task Data Struct - TaskObj
    - taskList - Complete List of Tasks, Sans root - Collection of TaskObj References
    - 
  - Meta Data