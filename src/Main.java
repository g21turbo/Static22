public class Main {

    //static - modifier. A single copy of a variable/method
    //         is created and shared.
    //         The class "owns" the static member

    public static void main(String[] args) {

        Friend bestFriend = new Friend("Bob");
        Friend friend1 = new Friend("Joe");
        Friend friend2 = new Friend("Ned");


        Friend.displayFriends();


    }
}
