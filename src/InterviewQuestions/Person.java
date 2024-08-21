package InterviewQuestions;

public class Person {
    void speak() {
        System.out.println("the person is speaking");
    }
}

class Teacher extends Person{
    void teach(){
        super.speak();
        System.out.println("the teacher is teaching");
    }
}

class Music extends Person{
    void make(){
        super.speak();
        System.out.println("the teacher is teaching");
    }
}

class MusicTeacher extends Teacher{
    @Override
    void speak() {
        super.speak();
        System.out.println("Which will be called");
    }
}
