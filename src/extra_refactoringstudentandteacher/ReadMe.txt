This program expands on Activity 6's 'Student and Teacher' program for printing
basic results.

Now the program will have features to add, remove and edit the details of both
students and lecturers, as well as print them out as per request of the user
input (similar to the Calculator task).

TO-DO LIST:
    - Implement 'Delete' functionality
    - Validate all possible variables and issues:
        > General range-checking for int inputs
        > Options where required (e.g. if more than 1 result, user must choose which result to edit/delete/etc)
    - Implement all functionality for 'Lecturers' (none of which is yet implemented)
    - Implement the following ideas as a bonus:
        > Assign Lecturers to the course they teach
            ~ This could mean creating a new object (a Class) of Courses with suitable information
              (e.g. Course ID, Title, Description, Semester Length, etc)
        > Assign Lecturers as 'Personal Tutor' attribute for Students
        > Ability to list individual Lecturer's list of Students that they teach/tutor as per the above


COMPLETED:
    - Student portal
        > 'Edit' functionality
            > Multiple choices of attributes to edit
        > 'Create' functionality
        > 'List' functionality
        > 'Search' functionality
            > Multiple choices of search method