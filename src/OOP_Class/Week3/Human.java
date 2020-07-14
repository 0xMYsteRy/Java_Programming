package OOP_Class.Week3;

class Human {
    String name;
    String gender;

    void talk() {
        System.out.println(name + ": We can change the world");
    }
}

class Talk {
    public static void main(String[] args) {
        //Create an instance using the the object
        Human newHuman = new Human();
        newHuman.name = "Elon Musk";
        newHuman.gender = "Male";

        newHuman.talk();
    }
}