""" Python program to merge two
sorted linked lists 
Contributed by Navtika"""

class Node:
	def __init__(self, data):
		self.data = data
		self.next = None


class LinkedList:
	def __init__(self):
		self.head = None

	def printList(self):
		temp = self.head
		while temp:
			print(temp.data, end=" ")
			temp = temp.next

	def addToList(self, newData):
		newNode = Node(newData)
		if self.head is None:
			self.head = newNode
			return

		last = self.head
		while last.next:
			last = last.next

		last.next = newNode


def mergeLists(headA, headB):

	dummyNode = Node(0)

	tail = dummyNode
	while True:
		if headA is None:
			tail.next = headB
			break
		if headB is None:
			tail.next = headA
			break
		if headA.data <= headB.data:
			tail.next = headA
			headA = headA.next
		else:
			tail.next = headB
			headB = headB.next
		tail = tail.next

	return dummyNode.next

listA = LinkedList()
listB = LinkedList()

n1=int(input("Enter number of elements of list 1:"))
n2=int(input("Enter number of elements of list 2:"))

for i in range(n1):
    listA.addToList(int(input("Enter value for list A:")))
for i in range(n2):
    listB.addToList(int(input("Enter value for list B:")))

listA.head = mergeLists(listA.head, listB.head)

print("Merged Linked List is:")
listA.printList()

