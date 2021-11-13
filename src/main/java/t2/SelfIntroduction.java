package t2;

import java.util.Scanner;

/**
 * Project name(项目名称)：练习_类与接口
 * Package(包名): t2
 * Class(类名): SelfIntroduction
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2021/11/13
 * Time(创建时间)： 13:09
 * Version(版本): 1.0
 * Description(描述)：
 * 创建一个SelfIntroduction对象，对象名称为person，利用类中已经编写好的方法传入相关的属性，
 * 即name（姓名）、age（年龄）、education（学历）、position（职位）；
 * 调用类的方法introduction()输出自我介绍的一句话。
 * <p>
 * 测试输入：
 * 张三 35 博士 讲师
 * 预期输出：
 * 大家好！我是张三，我今年35岁，博士学历，目前职位是讲师
 */

public class SelfIntroduction
{
    public void setName(String name)
    {
        this.name = name;
    }

    public void setAge(int age)
    {
        this.age = age;
    }

    public void setEducation(String education)
    {
        this.education = education;
    }

    public void setPosition(String position)
    {
        this.position = position;
    }

    public void introduction()
    {
        System.out.println("大家好！我是" + name + "，我今年" + age + "岁，"
                + education + "学历，" + "目前职位是" + position);
    }

    private String name;
    private int age;
    private String education;
    private String position;

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        int age = scanner.nextInt();
        String education = scanner.next();
        String position = scanner.next();

        /********** Begin *********/
        SelfIntroduction person = new SelfIntroduction();
        person.setName(name);
        person.setAge(age);
        person.setEducation(education);
        person.setPosition(position);
        person.introduction();

        /********** End *********/
    }
}
