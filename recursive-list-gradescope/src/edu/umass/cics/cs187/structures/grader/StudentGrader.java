package edu.umass.cics.cs187.structures.grader;

import com.github.tkutche1.jgrade.*;
import com.github.tkutche1.jgrade.gradedtest.GradedTestResult;

import static com.github.tkutche1.jgrade.gradedtest.GradedTestResult.HIDDEN;

public class StudentGrader {
    /* All @Grade/@BeforeGrading/@AfterGrading methods must take exactly one parameter
     * of type Grader. This parameter is the same grader throughout.
     *
     * @BeforeGrading methods are run before others.
     */
    @BeforeGrading
    public void initGrader(Grader grader) {
        grader.startTimer();
    }

    /* You can run unit tests that are annotated with @GradedTest to add
     * GradedTestResults to the Grader in this way.
     */
    @Grade
    public void runGradedUnitTests(Grader grader) {
        grader.runJUnitGradedTests(GraderTest.class);
    }

    /* You can also manually add GradedTestResults you create to the grader. */
    @Grade
    public void singleTestResult(Grader grader) {
        grader.addGradedTestResult(
                new GradedTestResult("manual test", "1", 1.0, HIDDEN)
        );
    }

    /* Grader.startTimer() and Grader.stopTimer() can be used to time the grader */
    @Grade
    public void loopForTime(Grader grader) {
        long startTime = System.currentTimeMillis();
        while (System.currentTimeMillis() - startTime < 1000);
    }

    /* @AfterGrading methods are run after all other methods. */
    @AfterGrading
    public void endGrader(Grader grader) {
        grader.stopTimer();
    }
}
