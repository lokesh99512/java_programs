package StramsPractise;

public class Reverse {


    public static ListNode reversGroup(ListNode head, int k) {
        if (head == null || k <= 1) return head;
        int length = 0;
        ListNode temp = head;
        while (temp != null) {
            length++;
            temp = temp.next;
        }
        return reversIngroup(head, k, length);
    }

    static ListNode reversIngroup(ListNode head, int k, int lenght) {
        if (lenght < k) return reverseList(head, lenght);
        ListNode prev = null, curr = head, next = null;
        int count = 0;
        while (count < k && curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
            count++;
        }
        if (next != null) {
            head.next = reversIngroup(next, k, lenght - k);
        }
        return prev;
    }

    private static ListNode reverseList(ListNode head, int lenght) {
        ListNode prev = null, curr = head, next = null;
        while (lenght > 0) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
            lenght--;
        }
        return prev;
    }


    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(2);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        head.next.next.next.next.next = new ListNode(6);
        int k = 4;
        System.out.println("original List: ");
        printList(head);
        head = reversGroup(head, k);

        System.out.println("reverse List");
        printList(head);

    }

    private static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
        System.out.println();

    }
}
