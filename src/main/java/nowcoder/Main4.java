package nowcoder;

import java.util.Scanner;

/**
 * @Author: zhen
 * @DateTime: 2021/3/16 23:40
 * @Description: 题目描述
 * •连续输入字符串，请按长度为8拆分每个字符串后输出到新的字符串数组；
 * •长度不是8整数倍的字符串请在后面补数字0，空字符串不处理。
 *
 * 输入描述:
 * 连续输入字符串(输入多次,每个字符串长度小于100)
 *
 * 输出描述:
 * 输出到长度为8的新字符串数组
 *
 * 示例1
 * 输入
 * 复制
 * abc
 * 123456789
 * 输出
 * 复制
 * abc00000
 * 12345678
 * 90000000
 */
public class Main4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // 注意 hasNext 和 hasNextLine 的区别
        while (in.hasNext()) { // 注意 while 处理多个 case
          String str =in.nextLine();
            string8(str);
        }
    }

    public static void string8(String str){
        if (str.length()>8){
            System.out.println(str.substring(0,8));
            str=str.substring(8);
            string8(str);
        }else{
            String replace0="00000000";
            str =str+replace0;

            System.out.println(str.substring(0,8));
        }
    }
}
