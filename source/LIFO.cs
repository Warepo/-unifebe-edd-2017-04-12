namespace Listing {

public class LIFO {

    private Node pointer = null;

    public LIFO ()
    {
        System.Console.WriteLine("New LIFO.");
    }

    public void push(int id)
    {
        Node aux = new Node(id);
	    aux.next = this.pointer;
	    this.pointer = aux;
    }

    public bool pop()
    {
    	if (this.pointer == null) return false;

        this.pointer = this.pointer.next;

        return true;
    }

    public void show()
    {
        Node aux = this.pointer;

        do {

            aux = aux.next;

            System.Console.WriteLine("Printing node!");

        } while(aux.next != null);

        // return;
    }

}

}