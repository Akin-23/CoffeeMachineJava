class Person {
    String name;
    int age;
}

class MakingChanges {
    public static void changeIdentities(Person p1, Person p2) {

        int age1 = p1.age;
        p1.age =p2.age;
        p2.age = age1;

        String name1 = p1.name;
        p1.name = p2.name;
        p2.name = name1;

    }
}