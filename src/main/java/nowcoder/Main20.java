package nowcoder;

import java.util.Scanner;
import java.util.regex.Pattern;

/**
 * @Author: zhen
 * @DateTime: 2021/3/20 20:52
 * @Description: 题目描述
 * 密码要求:
 *
 * 1.长度超过8位
 *
 * 2.包括大小写字母.数字.其它符号,以上四种至少三种
 *
 * 3.不能有相同长度大于2的子串重复
 *
 * 输入描述:
 * 一组或多组长度超过2的字符串。每组占一行
 *
 * 输出描述:
 * 如果符合要求输出：OK，否则输出NG
 *
 * 示例1
 * 输入
 * 复制
 * 021Abc9000
 * 021Abc9Abc1
 * 021ABC9000
 * 021$bc9000
 * 输出
 * 复制
 * OK
 * NG
 * NG
 * OK
 */
public class Main20 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // 注意 hasNext 和 hasNextLine 的区别
        while (in.hasNext()) { // 注意 while 处理多个 case
            String s =in.next();
            //判断字符长度
            if(s.length()<9){
                System.out.println("NG");
                continue;
            }
            //判断复杂度
            if(fuzadu(s)<3){
                System.out.println("NG");
                continue;
            }
            //判断是否有重复
            if(chongfu(s)){
                System.out.println("NG");
                continue;
            }
            System.out.println("OK");
        }
    }
    public static int fuzadu(String str){
        int num =0;
        Pattern p1 = Pattern.compile("[A-Z]");
        if(p1.matcher(str).find()){
            num++;
        }
        p1 = Pattern.compile("[a-z]");
        if(p1.matcher(str).find()){
            num++;
        }
        p1 = Pattern.compile("[0-9]");
        if(p1.matcher(str).find()){
            num++;
        }
        p1 = Pattern.compile("[^a-zA-Z0-9]");
        if(p1.matcher(str).find()){
            num++;
        }
        return num;
    }

    public static boolean chongfu(String str){
        for(int i=0;i<str.length()-3;i++){
            String tmp = str.substring(i,i+3);
            String tmp1= str.substring(i+3);
            if(tmp1.contains(tmp)){
                return true;
            }
        }
        return false;
    }
}
