package nowcoder;

import java.util.Scanner;

/**
 * @Author: zhen
 * @DateTime: 2021/3/20 21:33
 * @Description: 题目描述
 * 实现删除字符串中出现次数最少的字符，若多个字符出现次数一样，则都删除。输出删除这些单词后的字符串，字符串中其它字符保持原来的顺序。
 * 注意每个输入文件有多组输入，即多个字符串用回车隔开
 * 输入描述:
 * 字符串只包含小写英文字母, 不考虑非法输入，输入的字符串长度小于等于20个字节。
 *
 * 输出描述:
 * 删除字符串中出现次数最少的字符后的字符串。
 *
 * 示例1
 * 输入
 * 复制
 * abcdd
 * aabcddd
 * 输出
 * 复制
 * dd
 * aaddd
 */
public class Main23 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // 注意 hasNext 和 hasNextLine 的区别
        while (in.hasNext()) { // 注意 while 处理多个 case
            String str =in.next();
            String del="";
            char[] cs =str.toCharArray();
            int minNum =str.length();
            //判断 有i个相同的字符
            //判读第j字符有几个
            for(int j=0;j<cs.length;j++){
                int num =0;
                for(int k=0;k<cs.length;k++){
                    if(cs[j]==cs[k]){
                        num++;
                    }
                }
                if(num<minNum){
                    minNum =num;
                    //需要删除的字符
                    del = String.valueOf(cs[j]);
                }else if(num ==minNum){
                    del = del+String.valueOf(cs[j]);
                }
            }
            System.out.println(del);
            char[] dels= del.toCharArray();
            for(int j=0;j<dels.length;j++){
                str= str.replaceAll(String.valueOf(dels[j]),"");
            }

            System.out.println(str);
        }
    }
}
