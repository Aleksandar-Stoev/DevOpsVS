// This is a comment
// The second comment, denoting the changes
// The third comment through terminal
// after deleting
// with terminal
// the change for training the conflicts

public class Calculator {

    public int add(int a, int b) {
        return a + b;
    }

    // comment from user2
    // comment from user 1
    //change to show the synchronize changes button in VS
    public int subtract(int a, int b) {
        return a - b;
    }

    //change for fix from IDE
    public int multiply(int a, int b) {
        return a * b;
    }

    public double divide(double a, double b) {
        if (b == 0) {
            throw new IllegalArgumentException("Cannot divide by zero");
        }
        return a / b;
    }
}

// the other change for training the conflicts
