#!/usr/bin/env bash

# make cwd the compiled class files
cd classes

# invoke the main program of JGrade passing the class GradeHello as the main parameter
# sending output to the results.json file (or stdout if running locally).
if [ "$1" = "--local" ]; then
    java -jar ../lib/jgrade-1.1-all.jar -c edu.umass.cics.cs187.structures.grader.StudentGrader --pretty-print
else
    java -jar ../lib/jgrade-1.1-all.jar -c edu.umass.cics.cs187.structures.grader.StudentGrader -o /autograder/results/results.json
fi

# return to original cwd
cd ..
