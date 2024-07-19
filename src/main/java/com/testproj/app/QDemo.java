package com.testproj.app;

class QDemo {
    public static void main( String args[]) {
        Queue bigQ = new Queue(100);
        Queue smallQ = new Queue(4);
        char ch;
        int i;

        System.out.println("Using queue bigQ for saving alphabet");
        
        for (i = 0; i < 26; i++) {
            bigQ.put((char) ('A' + i));
            System.out.print("Content of queue bigQ: ");
            for (i = 0; i < 26; i++) {
                ch = bigQ.get();
                if (ch != (char) 0) {
                    System.out.print(ch);
                }
            }
        }
        System.out.println("\n");

        System.out.println ("Using queue smallQ for making errors");

        for (i = 0; i < 5; i++) {
            System.out.print("Trying to save " + (char) ('Z' - i));
            smallQ.put ((char) ('Z' - i));
            System.out.println();
        }
        System.out.println();

        System.out.print("smallQ queue content: ");
        for (i = 0; i < 5; i++) {
            ch = smallQ.get();

            if (ch!= (char) 0) {
                System.out.print(ch);
            }
        }
    }
}
    