/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */


struct ListNode* removeElements(struct ListNode* head, int val){
    if (head == NULL) return head;
    struct ListNode *p = head;
    
    if (p->val == val) return removeElements(p->next, val);
    
    while(p->next != NULL) {
        if (p->next->val == val) {
            p->next = p->next->next;
        } else {
            p = p->next;
        }
    }
    
    return head;
}