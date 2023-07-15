//package designpatterns.creational.builder;
//
//import java.security.InvalidParameterException;
//
//
//public class UserExamBuilder {
//
//    // 1 . Have all the attributes of userExam ==> DONE
//    // 2 . Able to validate all the variable and cross validation are possible. ==> DONE
//    // 3. Able to create object of the USerExam ==> DONE
//    private int englishMarks;
//    private int hindiMarks;
//    private int scienceMarks;
//
//    private UserExamBuilder() {}
//
//    private UserExam UserExam(){
//        if (hindiMarks>100 || englishMarks > 100 || scienceMarks > 100){
//            System.out.println("hindi marks are greater than 100");
//            throw  new InvalidParameterException("Either of the marks are greater than 100..");
//        }
//
//        UserExam exam = new UserExam();
//        exam.scienceMarks = this.scienceMarks;
//        exam.englishMarks = this.englishMarks;
//        exam.hindiMarks = this.hindiMarks;
//        return exam;
//    }
//}
