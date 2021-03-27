package leetcode;

/**
 * @Author: zhen
 * @DateTime: 2021/3/25 20:59
 * @Description: 存在一个按升序排列的链表，给你这个链表的头节点 head ，请你删除链表中所有存在数字重复情况的节点，只保留原始链表中 没有重复出现 的数字。
 * <p>
 * 返回同样按升序排列的结果链表。
 * <p>
 *  
 * <p>
 * 示例 1：
 * <p>
 * <p>
 * 输入：head = [1,2,3,3,4,4,5]
 * 输出：[1,2,5]
 * 示例 2：
 * <p>
 * <p>
 * 输入：head = [1,1,1,2,3]
 * 输出：[2,3]
 *  
 * <p>
 * 提示：
 * <p>
 * 链表中节点数目在范围 [0, 300] 内
 * -100 <= Node.val <= 100
 * 题目数据保证链表已经按升序排列
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/remove-duplicates-from-sorted-list-ii
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Solution82 {

    public class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public ListNode deleteDuplicates(ListNode head) {
        if (head == null) {
            return null;
        }

        if (head.next == null) {
            return head;
        }
        if (head.next.val == head.val) {
            //删除当前这个
            head = deleteDuplicate(head.next, head.val);
        } else {
            head.next = deleteDuplicates(head.next);
        }


        return head;
    }

    public ListNode deleteDuplicate(ListNode head, int pre) {
        if (head == null) {
            return null;
        }
        //如果和前一个相等
        if (head.val == pre) {
            //删除当前这个
            head = deleteDuplicate(head.next, pre);
        } else {
            head = deleteDuplicates(head);
        }


        return head;
    }

}
