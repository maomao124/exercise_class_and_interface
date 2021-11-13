package t1;

/**
 * Project name(项目名称)：练习_类与接口
 * Package(包名): t1
 * Class(类名): Yard
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2021/11/13
 * Time(创建时间)： 13:02
 * Version(版本): 1.0
 * Description(描述)：
 * 使用构造方法初始化边长。
 * 设计成员方法getPerimeter()和getAcreage()，运算并返回周长和面积。
 * 测试输入：
 * 3 4
 * 预期输出：
 * 14.0 12.0
 */

public class Yard
{
    private double length;
    private double width;

    public Yard()
    {

    }

    public Yard(double length, double width)
    {
        if (length >= 0)
        {
            this.length = length;
        }
        else
        {
            this.length = 0;
        }
        if (width >= 0)
        {
            this.width = width;
        }
        else
        {
            this.width = 0;
        }
    }

    public double getLength()
    {
        return length;
    }

    public void setLength(double length)
    {
        if (length >= 0)
        {
            this.length = length;
        }
        else
        {
            this.length = 0;
        }
    }

    public double getWidth()
    {
        return width;
    }

    public void setWidth(double width)
    {
        if (width >= 0)
        {
            this.width = width;
        }
        else
        {
            this.width = 0;
        }
    }

    public double getPerimeter()
    {
        return width + width + length + length;
    }

    public double getAcreage()
    {
        return width * length;
    }
}
