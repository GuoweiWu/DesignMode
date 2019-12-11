package TemplateMethod;

public class TestPaper {
    public void testQuestion1(){
        System.out.println("1111");
        System.out.println("答案" + answer1());
    }

    protected String answer1(){
        return "";
    }

    public void testQuestion2(){
        System.out.println("2222");
    }

    protected String answer2(){
        return "";
    }

    public void testQuestion3(){
        System.out.println("3333");
    }

    protected String answer3(){
        return "";
    }
}
