package main

import "fmt"


type ListNode struct {
    Val int
    Next *ListNode
}

func addTwoNumbers(l1 *ListNode, l2 *ListNode) *ListNode {
	var head *ListNode
	var tail *ListNode
	carry := 0
	for l1 != nil || l2 != nil {
		n1, n2 := 0, 0
		if l1 != nil {
			n1 = l1.Val
			l1 = l1.Next
		}
		if l2 != nil {
			n2 = l2.Val
			l2 = l2.Next
		}
		sum := n1 + n2 + carry
		if head == nil {
			head = &ListNode{Val: sum%10}
			tail = head
		} else {
			tail.Next = &ListNode{Val: sum%10}
			tail = tail.Next
		}
		carry = sum/10
	}
	return head
}

func create(arr []int) *ListNode {
	var head *ListNode
	var tail *ListNode
	for i := 0; i < len(arr); i++ {
		if head == nil && tail == nil {
			head = &ListNode{Val: arr[i], Next:nil}
			tail = head
		} else {
			tail.Next =  &ListNode{Val: arr[i], Next:nil}
			tail = tail.Next
		}
	}
	return head
}

func printListNode(head *ListNode) {
	tail := head
	for {
		if tail == nil {
			break
		}
		fmt.Println(tail.Val)
		tail = tail.Next
	}
}

func main() {
    fmt.Println("Hello, World!")
	arr1 := []int{1,2,3,4,5}
	arr2 := []int{3,4,5,6}
	list1 := create(arr1)
	list2 := create(arr2)
	// printListNode(list1)
	result := addTwoNumbers(list1, list2)
	printListNode(result)

}