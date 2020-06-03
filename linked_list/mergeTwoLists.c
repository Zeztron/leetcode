/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */


struct ListNode* mergeTwoLists(struct ListNode* l1, struct ListNode* l2){
    struct ListNode *last, *l3;
    
    if (!l1) return l2;
    if (!l2) return l1;
    
    if (l1->val < l2->val) {
        l3 = last = l1;
        l1 = l1->next;
        last->next = NULL;
    } else {
        l3 = last = l2;
        l2 = l2->next;
        last->next = NULL;
    }
    
    while (l1 != NULL && l2 != NULL) {
        if (l1->val < l2->val) {
            last->next = l1;
            last = l1;
            l1 = l1->next;
            
        } else {
            last->next = l2;
            last = l2;
            l2 = l2->next;
        }
        
        last->next = NULL;
    }
    
    if (l1 != NULL) {
        last->next = l1;
    } else {
        last->next = l2;
    }
    
    return l3;
}