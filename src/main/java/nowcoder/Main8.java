package nowcoder;

import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

/**
 * @Author: zhen
 * @DateTime: 2021/3/17 23:40
 * @Description: 题目描述
 * 数据表记录包含表索引和数值（int范围的正整数），请对表索引相同的记录进行合并，即将相同索引的数值进行求和运算，输出按照key值升序进行输出。
 *
 * 输入描述:
 * 先输入键值对的个数
 * 然后输入成对的index和value值，以空格隔开
 *
 * 输出描述:
 * 输出合并后的键值对（多行）
 *
 * 示例1
 * 输入
 * 4
 * 0 1
 * 0 2
 * 1 2
 * 3 4
 * 输出
 * 0 3
 * 1 2
 * 3 4
 */
public class Main8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int line = in.nextInt();
        //treeMap 是有序的map
        Map<Integer,Integer> t= new TreeMap();
        for(int i=0;i<line;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            if(t.get(a)==null){
                t.put(a,b);
            }else{
                t.put(a,b+t.get(a));
            }
        }
        Iterator it = t.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Object key = entry.getKey();
            Object value = entry.getValue();
            System.out.println(key + " " + value);
        }

    }
}
