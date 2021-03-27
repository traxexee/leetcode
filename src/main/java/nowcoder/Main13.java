package nowcoder;

import java.util.Scanner;

/**
 * @Author: zhen
 * @DateTime: 2021/3/20 14:43
 * @Description: 题目描述
 * 将一个英文语句以单词为单位逆序排放。例如“I am a boy”，逆序排放后为“boy a am I”
 * 所有单词之间用一个空格隔开，语句中除了英文字母外，不再包含其他字符
 *
 * 输入描述:
 * 输入一个英文语句，每个单词用空格隔开。保证输入只包含空格和字母。
 *
 * 输出描述:
 * 得到逆序的句子
 *
 * 示例1
 * 输入
 * 复制
 * I am a boy
 * 输出
 * 复制
 * boy a am I
 */
public class Main13 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        String[] ss= s.split(" ");
        for(int i=ss.length-1;i>-1;i--){
            System.out.print(ss[i]);
            if(i>0){
                System.out.print(" ");
            }
        }
    }
}
