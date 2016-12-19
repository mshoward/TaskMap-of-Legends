#Design

##Contents

1. Data
2. UI Screens
3. Interfaces
4. Navigation
5. Future Considerations


##1 - Data

###1.1 - Task Model

####1.1.1 - TaskNode - Task Data Structure
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

####1.1.2 - TaskGraph

- Data
  - Data Fields
    - root - Root Level Task Data Struct - TaskNode
      - The node to which all tasks without parents are attached
    - taskList - Complete List of Tasks, Sans root - Collection of TaskObj References
      - length
    - name - String
    - TaskGraphIdNo - Long Integer
  - Meta Data

###1.2 - UI Model

####1.2.1 - Generic List Item Display View

- Heading
- Optional 1
- Body
- Optional 2
- Footer

####1.2.2 - Generic TaskGraph Navigator

- implements iGraphNavigator
- Current Node Reference
- Previous Node Reference
- Next Node References
- TaskGraph object reference
- Navigation Functions
  - next(), next(index), next(which)
  - prev()
  - horz(index), horz(which)
  - changeRoot(newRoot)

####1.2.3 - Generic Graph Position Display View

- iGraphNavigator navObj
- iListItemFactory listItemFactoryObj