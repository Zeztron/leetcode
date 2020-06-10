struct ListNode {
  int val;
  struct ListNode *next;
};

struct ListNode* middleNode(struct ListNode* head){
    if (!head) return head;
    
    struct ListNode *slow, *fast;
    slow = fast = head;

    while (fast && fast->next) {
        slow = slow->next;
        fast = fast->next;
        if (fast) {
            fast = fast->next;
        }
    }
    
    return slow;
}
