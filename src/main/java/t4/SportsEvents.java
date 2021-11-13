package t4;

import java.util.Scanner;

/**
 * Project name(项目名称)：练习_类与接口
 * Package(包名): t4
 * Class(类名): SportsEvents
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2021/11/13
 * Time(创建时间)： 13:21
 * Version(版本): 1.0
 * Description(描述)：
 * 通过setSports()设置喜欢的体育赛事类型，如篮球、足球；
 * 通过setTeam()设置支持的队伍，如洛杉矶湖人、皇家马德里等；
 * 通过introduction()大声说出你喜欢的运动，和喜欢的球队，
 * 格式如下：“我最喜欢的体育运动是xxx，我最喜欢的球队是xxx”。（具体输入输出格式可参见测试样例）
 * 测试输入：
 * 篮球 洛杉矶湖人
 * 预期输出：
 * 我最喜欢的体育运动是篮球，我最喜欢的球队是洛杉矶湖人
 */

interface Sports
{
    void setSports(String sports);
}

interface Team
{
    void setTeam(String team);
}

interface ChooseTeam extends Sports, Team
{
    void introduction();
}

/********** Begin *********/

class MyFavourateTeam implements ChooseTeam
{


    @Override
    public void setSports(String sports)
    {
        System.out.print("我最喜欢的体育运动是" + sports);
    }

    @Override
    public void setTeam(String team)
    {
        System.out.println("，我最喜欢的球队是"+team);
    }

    @Override
    public void introduction()
    {

    }
}

/********** End *********/


public class SportsEvents
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        String sports = scanner.next();
        String team = scanner.next();
        MyFavourateTeam myFavourateTeam = new MyFavourateTeam();
        myFavourateTeam.setSports(sports);
        myFavourateTeam.setTeam(team);
        myFavourateTeam.introduction();
    }
}
