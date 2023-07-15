package designpatterns.creational.builder;

import java.security.InvalidParameterException;

public class UserExam {
    private int englishMarks;
    private int hindiMarks;
    private int scienceMarks;

    private UserExam(){} // avoid object creation using constructor

    public static UserExamBuilder getBuilder(){
        return new UserExamBuilder();
    }

    public static  class UserExamBuilder {

        // 1 . Have all the attributes of userExam ==> DONE
        // 2 . Able to validate all the variable and cross validation are possible. ==> DONE
        // 3. Able to create object of the USerExam ==> DONE
        private int englishMarks;
        private int hindiMarks;
        private int scienceMarks;


        public UserExamBuilder setEnglishMarks(int englishMarks) {
            this.englishMarks = englishMarks;
            return this;
        }

        public UserExamBuilder setHindiMarks(int hindiMarks) {
            this.hindiMarks = hindiMarks;
            return this;
        }

        public UserExamBuilder setScienceMarks(int scienceMarks) {
            this.scienceMarks = scienceMarks;
            return this;
        }

        private UserExamBuilder() {}

        public UserExam build(){
            if (hindiMarks>100 || englishMarks > 100 || scienceMarks > 100){
                System.out.println("hindi marks are greater than 100");
                throw  new InvalidParameterException("Either of the marks are greater than 100..");
            }

            UserExam exam = new UserExam();
            exam.scienceMarks = this.scienceMarks;
            exam.englishMarks = this.englishMarks;
            exam.hindiMarks = this.hindiMarks;
            return exam;
        }
    }

    @Override
    public String toString() {
        return "UserExam{" +
                "englishMarks=" + englishMarks +
                ", hindiMarks=" + hindiMarks +
                ", scienceMarks=" + scienceMarks +
                '}';
    }
}
