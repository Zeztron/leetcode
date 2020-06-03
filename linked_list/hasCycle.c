/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */

struct ListNode {
  int val;
  struct ListNode *next;
};

bool hasCycle(struct ListNode *head) {
  struct ListNode *p, *q;
  p = q = head;
  if (!head != !head->next) return false;

  do {
    p = p->next;
    q = q->next;
    q = q ? q->next : q;
  } while(p && q && p != q);

  if (p == q) return true;
  return false;
}