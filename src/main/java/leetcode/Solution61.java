package leetcode;

/**
 * @Author: zhen
 * @DateTime: 2021/3/27 12:24
 * @Description: 给你一个链表的头节点 head ，旋转链表，将链表每个节点向右移动 k 个位置。
 * <p>
 *  
 * <p>
 * 示例 1：
 * <p>
 * <p>
 * 输入：head = [1,2,3,4,5], k = 2
 * 输出：[4,5,1,2,3]
 * 示例 2：
 * <p>
 * <p>
 * 输入：head = [0,1,2], k = 4
 * 输出：[2,0,1]
 *  
 * <p>
 * 提示：
 * <p>
 * 链表中节点的数目在范围 [0, 500] 内
 * -100 <= Node.val <= 100
 * 0 <= k <= 2 * 109
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/rotate-list
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Solution61 {
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || k == 0) {
            return head;
        }
        ListNode cursor = head;
        //尾指针
        ListNode tail = null;
        int length = 1;
        //循环 得到总长度
        while (cursor.next != null)
        {
            cursor = cursor.next;
            length++;
        }
        //得到循环的次数
        int loop = length - (k % length);
        //指向尾结点
        tail = cursor;
        //改成循环链表
        cursor.next = head;
        //指向头结点
        cursor = head;
        //开始循环
        for (int i = 0; i < loop; i++) {
            cursor = cursor.next;
            tail = tail.next;
        }
        //改成单链表
        tail.next = null;
        //返回当前头
        return cursor;
    }
}
