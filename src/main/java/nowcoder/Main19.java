package nowcoder;


import java.util.Scanner;
import java.util.*;

/**
 * @Author: zhen
 * @DateTime: 2021/3/20 19:35
 * @Description: 题目描述
 * 开发一个简单错误记录功能小模块，能够记录出错的代码所在的文件名称和行号。
 * <p>
 * <p>
 * 处理：
 * <p>
 * <p>
 * 1、 记录最多8条错误记录，循环记录，最后只用输出最后出现的八条错误记录。对相同的错误记录只记录一条，但是错误计数增加。最后一个斜杠后面的带后缀名的部分（保留最后16位）和行号完全匹配的记录才做算是”相同“的错误记录。
 * 2、 超过16个字符的文件名称，只记录文件的最后有效16个字符；
 * 3、 输入的文件可能带路径，记录文件名称不能带路径。
 * 4、循环记录时，只以第一次出现的顺序为准，后面重复的不会更新它的出现时间，仍以第一次为准
 * <p>
 * 输入描述:
 * 每组只包含一个测试用例。一个测试用例包含一行或多行字符串。每行包括带路径文件名称，行号，以空格隔开。
 * <p>
 * 输出描述:
 * 将所有的记录统计并将结果输出，格式：文件名 代码行数 数目，一个空格隔开，如：
 * <p>
 * 示例1
 * 输入
 * 复制
 * D:\zwtymj\xccb\ljj\cqzlyaszjvlsjmkwoqijggmybr 645
 * E:\je\rzuwnjvnuz 633
 * C:\km\tgjwpb\gy\atl 637
 * F:\weioj\hadd\connsh\rwyfvzsopsuiqjnr 647
 * E:\ns\mfwj\wqkoki\eez 648
 * D:\cfmwafhhgeyawnool 649
 * E:\czt\opwip\osnll\c 637
 * G:\nt\f 633
 * F:\fop\ywzqaop 631
 * F:\yay\jc\ywzqaop 631
 * 输出
 * 复制
 * rzuwnjvnuz 633 1
 * atl 637 1
 * rwyfvzsopsuiqjnr 647 1
 * eez 648 1
 * fmwafhhgeyawnool 649 1
 * c 637 1
 * f 633 1
 * ywzqaop 631 2
 */
public class Main19 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Map<String, Integer> errmap = new LinkedHashMap();
        // 注意 hasNext 和 hasNextLine 的区别
        while(in.hasNextLine()){ // 注意 while 处理多个 case
            String str = in.nextLine();
            String[] ss = str.split("\\\\");
            String err = ss[ss.length - 1];
            String[] errs = err.split(" ");
            String errNumber = errs[1];
            String errStr = errs[0];
            if (errStr.length() > 16) {
                errStr = errStr.substring(errStr.length() - 16);
            }

            errStr = errStr + " " + errNumber;
            if (errmap.containsKey(err)) {
                errmap.put(errStr, errmap.get(err) + 1);
            } else {

                errmap.put(errStr, 1);
            }
        }

        int count = 0;
        for(String key:errmap.keySet()){
            count++;
            if (count > errmap.size() - 8) {
                System.out.println(key + " " + errmap.get(key));
            }
        }
    }


}
