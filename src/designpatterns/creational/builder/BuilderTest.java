package designpatterns.creational.builder;

public class BuilderTest {
    public static void main(String[] args) {
      UserExam.UserExamBuilder builder =  UserExam.getBuilder();
//      builder.setEnglishMarks(12);
//      builder.setHindiMarks(15);
//      builder.setScienceMarks(100);

        builder.setHindiMarks(12)
                .setEnglishMarks(14)
                .setScienceMarks(12)
                .build();

     UserExam userExam= builder.build();
        System.out.println(userExam);

    }
}
