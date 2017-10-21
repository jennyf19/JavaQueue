package qdemo.java;

class Queue{
    char q[]; // This array holds the queue
    int putLoc, getLoc; // The put and get indices
    
    Queue(int size)
    {
        q = new char[size]; // allocate memory for the queue
        putLoc = getLoc = 0;
    }
    
    // put a character into the queue
    void put(char ch){
        if(putLoc == q.length)
        {System.out.println(" - Queue is full.");
        return;
        }
        
        // new element is stored at this location and putLoc is incremented
        q[putLoc++] = ch;    
    }
    
    // get a character from the queue
    char get(){
        if(getLoc == putLoc)
        {
            System.out.println("- Queue is empty.");
            return(char) 0;
        }
        
        // return next element and increment getLoc
        // getLoc always indicates the location of the next element to be retrieved
        return q[getLoc++];
    }
}

public class QDemoJava {

    public static void main(String[] args) {
        Queue bigQ = new Queue(100);
        Queue smallQ = new Queue(4);
        char ch;
        int i;
        
        System.out.println("Using bigQ to store the alphabet.");
        // put numbers into the bigQ
        for (i = 0; i < 26; i++) {
            bigQ.put((char)('A' + i));
        }
        
        //  retrieve and display elements from bigQ
        System.out.print("Contents of bigQ: ");
        for(i=0; i < 26; i++){
            ch = bigQ.get();
            if(ch!=(char) 0)System.out.print(ch);
        }
        
        System.out.println("\n");
        
        System.out.println("Using smallQ to generate errors.");
        
        // use smallQ to generate errors 
        for (i = 0; i < 5; i++) {
            System.out.println("Attempting to store " + (char)('Z'- i));
            smallQ.put((char)('Z'- i));
            System.out.println();            
        }
        System.out.println();
        
        // more errors on smallQ
        System.out.print("Contents of smallQ: ");
        for(i=0; i < 5; i++){
            ch = smallQ.get();
            if(ch != (char) 0) System.out.print(ch);
        }
    }    
}
