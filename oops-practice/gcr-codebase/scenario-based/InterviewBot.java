package ioexamples;

public class InterviewBot {
    String botName;
    String technology;
    InterviewBot(String botName, String technology){
        this.botName=botName;
        this.technology=technology;
    }
    static void conductInterview(InterviewBot i){
        System.out.println(i.botName+" "+i.technology+" Interview Conducted");
    }
    public static void main(String[] args){
        InterviewBot i1=new InterviewBot("Rameshwar","DevOPs");
        InterviewBot i2=new InterviewBot("Praful","MERN");
        InterviewBot i3=new InterviewBot("Rahul","Springboot");
        conductInterview(i1);
        conductInterview(i2);
    }
}
