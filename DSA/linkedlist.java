class link{
    int data;
    link next;

}
public class linkedlist {
	public static void main(String[] args) {
        link head = new link();
        head.data = 20;
        link newlink = new link();
        newlink.data = 30;
        newlink.next = head;
        head = newlink;
        System.out.println(" --> "+head.data + " --> " + head.next.data);
    }
}