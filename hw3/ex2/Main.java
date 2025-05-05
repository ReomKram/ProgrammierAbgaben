package hw3.ex2;

public class Main {
    public static void main(String[] args) {
        Message m1 = new Email();
        Message m2 = new SMS();

        System.out.println(m1.getType());
        System.out.println(m2.getType());

        // Attempt to call send() safely
        if (m1 instanceof Email) {
            ((Email) m1).send(); // Safely call send() after checking the type
        } else {
            System.out.println("m1 is not an Email, cannot call send()");
        }
    }

    /*
     * Answer the following questions.
     * • What is the static type of m1? What is its dynamic type?
     * • Which method is called? Why?
     * • Why can’t send() be called directly?
     * • How could you safely call send() anyway (e.g. instanceof)?
     * 
     * 1. the static type of m1 is Message, and the dynamic type is an Email.
     * 2. since from calling methods on m1 immediately, the get type method is also
     * there in Message.
     * Hence if send Method is called, there isn't such a method for Message.
     * 3. explained above, only referencing the static type and not the dynamic one.
     * 4. you could check the true type by using isntanceof in combination with a if
     * and else loop to
     * ensure that the class is of a certain type, and then you could cast it to the
     * required type.
     * 
     */

}
