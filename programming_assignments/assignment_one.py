"""
Assignment Instructions

Goal: Create two classes to implement

1) Course (base class)
- Private fields:
  - course number (string)
  - course title (string)
- Methods:
  - setCourseNumber(course_number: str) -> None
  - getCourseNumber() -> str
  - setCourseTitle(course_title: str) -> None
  - getCourseTitle() -> str
  - printInfo() -> None
    - Must print exactly:
      Course Information:
         Course Number: <course number>
         Course Title: <course title>

2) OfferedCourse (derived class of Course)
- Inherits:
  - course number
  - course title
  - Course methods
- Private fields:
  - instructor name (string)
  - location (string)
  - class time (string)
- Methods:
  - setInstructorName(instructor_name: str) -> None
  - getInstructorName() -> str
  - setLocation(location: str) -> None
  - getLocation() -> str
  - setClassTime(class_time: str) -> None
  - getClassTime() -> str

Program behavior
- Read 7 input lines in this exact order:
  1. courseNumber
  2. courseTitle
  3. oCourseNumber
  4. oCourseTitle
  5. instructorName
  6. location
  7. classTime
- Create:
  - myCourse as a Course
  - myOfferedCourse as an OfferedCourse
- Set fields using setters, then print output in this order:
  1. myCourse.printInfo()
  2. myOfferedCourse.printInfo()
  3. Print three additional lines (exact labels and indentation):
     Instructor Name: <instructor name>
     Location: <location>
     Class Time: <class time>

Output formatting rules
- Match spaces exactly as shown in the example:
  - No blank line between the two course blocks.
  - The label lines inside printInfo() are indented by 3 spaces.
  - The three final lines are also indented by 3 spaces.

Example
Input:
ECE287
Digital Systems Design
ECE387
Embedded Systems Design
Mark Patterson
Wilson Hall 231
WF: 2-3:30 pm

Output:
Course Information:
   Course Number: ECE287
   Course Title: Digital Systems Design
Course Information:
   Course Number: ECE387
   Course Title: Embedded Systems Design
   Instructor Name: Mark Patterson
   Location: Wilson Hall 231
   Class Time: WF: 2-3:30 pm
"""

class Course:
    def __init__(self):
        self.courseNumber: str = ""
        self.courseTitle: str = ""

    def setCourseNumber(self, x):
        self.courseNumber = x

    def setCourseTitle(self, x):
        self.courseTitle = x

    def printInfo(self):
        print("Course Information:")
        print(f"   Course Number: {self.courseNumber}")
        print(f"   Course Title: {self.courseTitle}")

class OfferedCourse:
    def __init__(self):
        self.courseNumber: str = ""
        self.courseTitle: str = ""
        self.instructorName: str = ""
        self.location: str = ""
        self.classTime: str = ""

    def setCourseNumber(self, x):
        self.courseNumber = x
    
    def setCourseTitle(self, x):
        self.courseTitle = x
    
    def setInstructorName(self, x):
        self.instructorName = x
    
    def setLocation(self, x):
        self.location = x
    
    def setClassTime(self, x):
        self.classTime = x
    
    def printInfo(self):
        print("Course Information:")
        print(f"   Course Number: {self.courseNumber}")
        print(f"   Course Title: {self.courseTitle}")
        print(f"   Instructor Name: {self.instructorName}")
        print(f"   Location: {self.location}")
        print(f"   Class Time: {self.classTime}")

def main():
    myCourse = Course()
    myOfferedCourse = OfferedCourse()

    courseNumber = input()
    courseTitle = input()

    oCourseNumber = input()
    oCourseTitle = input()
    instructorName = input()
    location = input()
    classTime = input()

    myCourse.setCourseNumber(courseNumber)
    myCourse.setCourseTitle(courseTitle)
    myCourse.printInfo()

    myOfferedCourse.setCourseNumber(oCourseNumber)
    myOfferedCourse.setCourseTitle(oCourseTitle)
    myOfferedCourse.setInstructorName(instructorName)
    myOfferedCourse.setLocation(location)
    myOfferedCourse.setClassTime(classTime)
    myOfferedCourse.printInfo()

    print("   Instructor Name: " + myOfferedCourse.getInstructorName())
    print("   Location: " + myOfferedCourse.getLocation())
    print("   Class Time: " + myOfferedCourse.getClassTime())


if __name__ == "__main__":
    main()
