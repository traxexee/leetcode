package leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: zhen
 * @DateTime: 2021/3/16 21:42
 * @Description: 给定一个字符串，请你找出其中不含有重复字符的 最长子串 的长度。
 *
 *  
 *
 * 示例 1:
 *
 * 输入: s = "abcabcbb"
 * 输出: 3
 * 解释: 因为无重复字符的最长子串是 "abc"，所以其长度为 3。
 * 示例 2:
 *
 * 输入: s = "bbbbb"
 * 输出: 1
 * 解释: 因为无重复字符的最长子串是 "b"，所以其长度为 1。
 * 示例 3:
 *
 * 输入: s = "pwwkew"
 * 输出: 3
 * 解释: 因为无重复字符的最长子串是 "wke"，所以其长度为 3。
 *      请注意，你的答案必须是 子串 的长度，"pwke" 是一个子序列，不是子串。
 * 示例 4:
 *
 * 输入: s = ""
 * 输出: 0
 *  
 *
 * 提示：
 *
 * 0 <= s.length <= 5 * 104
 * s 由英文字母、数字、符号和空格组成
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/longest-substring-without-repeating-characters
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Solution3 {
    public static int lengthOfLongestSubstring(String s) {
        char[] a= s.toCharArray();
        int num = 0;//用来存放最大值
        List listTmp = new ArrayList();//存放不同的字符
        for (int i = 0; i <a.length ; i++) {

            int exist = listTmp.indexOf(a[i]);//判断是否有字符
            if(exist>-1){
                for (int j=0;j<=exist;j++) {

                    listTmp.remove(0);//删除到重复的那个元素
                }
            }
            listTmp.add(a[i]);
            System.out.println(listTmp);
            if(num <listTmp.size()){
                num =listTmp.size();//最大长度

            }
        }

        return num;
    }

    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("adsgfasdgfawgvascdgqrewheqtbswwevvfsazet253g vq"));
    }

}
