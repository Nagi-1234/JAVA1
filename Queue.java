
class Tqueue{

	int data;

	Tqueue Link;

}

class Queue {

	Tqueue head;



		void enqueue(int value) {

			Tqueue newNode = new Tqueue();

			newNode.data=value;

			if(head==null) {

				head=newNode;

			}else {

				Tqueue temp = head;

				while(temp.Link!=null) {

					temp=temp.Link;

				}

				temp.Link=newNode;

			}

		}



		void Dequeue() {

			if(!isEmpty())

				 // add10.link =>add20

			head=head.Link;

			else {

				System.out.println("queue is empty");

			}

		}

		int peek() {

			if(!isEmpty()) {

				return head.data;

			}

			return -1;

		}

		boolean isEmpty() {

			return head==null;

		}

	public static void main(String[] args) {

		Queue ob = new Queue() ;

		ob.enqueue(10);

		ob.enqueue(20);

		ob.enqueue(30);

		ob.enqueue(40);

		ob.Dequeue();

		ob.Dequeue();

		System.out.println(ob.peek());

		System.out.println(ob.isEmpty());

	}

}


