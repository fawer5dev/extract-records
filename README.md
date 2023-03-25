# extract-records from a file
This Java program reads a text file named "Docs.txt" and searches for records that contain certain identification numbers specified in an array of Strings named "cedulas". The matching records are then written to a new text file named "CEDULASexp.txt".

The program uses the following classes from the Java I/O package:

File: to represent the input and output files
FileReader: to read characters from the input file
BufferedReader: to read lines of text from the input file
FileWriter: to write characters to the output file
PrintWriter: to write formatted text to the output file
The program has a try-catch block to handle any IOExceptions that occur during file I/O.

The program also has a counter "cont" to keep track of the number of records found.

Within the try block, the program reads each record from the input file using a BufferedReader and searches for the identification numbers specified in the "cedulas" array. If a matching record is found, it is written to the output file using a PrintWriter.

Finally, the program closes the input and output files and prints the number of records found to the console.

One issue with the program is that the message "no hay cedulas" is printed every time a record is read from the input file, even if it does not contain any of the identification numbers specified in the "cedulas" array. This message should be moved outside the inner for loop, so it is only printed once for each record.
