public class TestScores {
    private static final int MAX_SCORE = 100;

private int[] scores;

public TestScores(int[] scores)
{
this.scores = scores;
}

private int computeAverage() throws IllegalArgumentException
{
int sum = 0;
for (int i = 0; i < scores.length; i++)
{
int score = scores[i];
if (score < 0 || score > MAX_SCORE)
{
throw new IllegalArgumentException("Score (" + score + ") is not in the range 0-" + MAX_SCORE);
}
sum += scores[i];
}
int average = sum / scores.length;
return average;
}

public static void main(String[] args)
{
TestScores testScores = new TestScores(new int[] { 50, 70, 81 });
try
{
int averageScore = testScores.computeAverage();

char letterGrade;
if (averageScore < 60) letterGrade = 'F';
else if (averageScore < 70) letterGrade = 'D';
else if (averageScore < 80) letterGrade = 'C';
else if (averageScore < 90) letterGrade = 'B';
else letterGrade = 'A';

System.out.println("\nYour average score is " + averageScore + " and your grade is an " +
letterGrade);
}
catch (IllegalArgumentException illegalArgumentException)
{
System.out.println(illegalArgumentException.getMessage());
}

}

}
