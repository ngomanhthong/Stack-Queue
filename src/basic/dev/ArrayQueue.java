package basic.dev;

public class ArrayQueue {
	private int maxSize; // kích thước tối đa của mảng
	private int[] queueArray; // mảng lưu trữ các phần tử của queue
	private int front; // chỉ số của phần tử đầu tiên của queue
	private int rear; // chỉ số của phần tử cuối cùng của queue
	private int currentSize; // kích thước hiện tại của queue

	// Constructor
	public ArrayQueue(int maxSize) {
		this.maxSize = maxSize;
		queueArray = new int[maxSize];
		front = 0;
		rear = -1;
		currentSize = 0;
	}

	// Phương thức đưa phần tử vào queue
	public void enqueue(int element) {
		if (isFull()) {
			throw new RuntimeException("Queue is full");
		}
		rear = (rear + 1) % maxSize;
		queueArray[rear] = element;
		currentSize++;
	}

	// Phương thức lấy phần tử khỏi queue
	public int dequeue() {
		if (isEmpty()) {
			throw new RuntimeException("Queue is empty");
		}
		int element = queueArray[front];
		front = (front + 1) % maxSize;
		currentSize--;
		return element;
	}

	// Phương thức kiểm tra queue có rỗng hay không
	public boolean isEmpty() {
		return (currentSize == 0);
	}

	// Phương thức kiểm tra queue có đầy hay không
	public boolean isFull() {
		return (currentSize == maxSize);
	}
}
