/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package ProjectCafe;

public class App {
    public String getGreeting() {
        //git test
        return "Hello World!";
    }

    public static void main(String[] args) {
        System.out.println(new App().getGreeting());
        new Login().setVisible(true);
    }
}
