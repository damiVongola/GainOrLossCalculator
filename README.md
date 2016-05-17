# GainOrLossCalculator
This program uses a doubly linked list to create a capital gain and loss calculator
---------
Classes
---------
CapitalGainOrLoss
CapitalGainOrLossCalculator
DoublyLinkedList
DoublyLinkedQueue
Queue

-----------------------
Description of Classes
-----------------------
CapitalGainOrLoss: This is the main class where the user inputs the number of shares they want to buy or sell. Note: Transactions are on consecutive days
Here i have programmed a simple user interface, using conditionals and a while loop.
CapitalGainOrLossCalculator: This is where the calculation takes place. Here i am using a double ended queue, and bought shares are enqueued into the
the queue while sold shares are removed from the queue. This dequeueing only occurs number of shares bought is less than that of the number sold
DoublyLinkedList: This is a doublylinkedlist implementation that uses nodes to store references and elements. Source: Data Structures and algorithms in Java by Wiley
DoublyLinkedQueue:This is a double ended queue that was created using the DoublyLinkedList. Source: Data Structures and algorithms in Java by Wiley
Queue:This is an interface for a generic queue. Source: Data Structures and algorithms in Java by Wiley
