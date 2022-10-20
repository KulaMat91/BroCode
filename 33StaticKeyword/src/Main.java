public class Main {
    public static void main(String[] args) {
        // static = modifier. A single copy of a variable/method is created and shared.
        //			The class "owns" the static member

        Friend friend1 = new Friend("Mike");
        Friend friend2 = new Friend("Mario");
        Friend friend3 = new Friend("Dario");
        Friend friend4 = new Friend("Sandy");

        System.out.println(Friend.numberOfFriends);
        Friend.displayFriends();
    }
}
