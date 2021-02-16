# MyBentoCode

There are two modules FindDirectory which solves the first Problem

ProblemStatement_1 - Please write a program that can read the contents of any directory 
(and its subdirectories) in the filesystem, and print out the contents sorted in order of 
file size in the command line. The directory to search should be passed in as a parameter 
to the program. The output should show the full path of the file, the file name, and the file size. 

My Assumptions:

- I would be given root directory.
- There cannot be circular directory structure. 
  A -> B -> A (Two directory can have same name but they won't be same directory)
- A directory can have both files and other directory. 
  When printing directory content print the name of contained directories
  
Time complexity: O(nlogn) - n is the number of directories. As I sort the directories
Space Complexity: O(n) - Saving the list of the content

ProblemStatement_2 - Please write a program that can take in a string as input and print 
out the result by applying the following string compression algorithm: If a character, ch, 
occurs N(> 1) times in a row, then it will be represented by {ch}{n}. 
For example, if the substring is a sequence of 'a' ("aaaa"), it will be represented as 
"a4". If a character, ch, occurs exactly one time in a row, then it will be simply 
represented as ch. For example, if the substring is "a", then it will be represented as "a".

Solution:
Time complexity: O(n)
Space Complexity: O(1) 
