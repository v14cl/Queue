package com.testproj.app;


enum DataType {
    CHAR,
    INT,
    DOUBLE
}


class Queue {
    double internal_arr[];
    int putloc, getloc;
    DataType datatype; 
    
    Queue(int size, DataType data_type) {
        internal_arr = new double[size];
        putloc = getloc = 0;
        datatype = data_type;

    }


    // DOUBLE
    void put_double(double value) {
        if (datatype != DataType.DOUBLE) {
            System.err.println("[ERROR] The queue is supporting " + datatype + " data type!");
            return;
        }

        if (putloc == internal_arr.length) {
            System.out.println(" Queue is full ");
            return;
        }
        internal_arr[putloc++] = value;
    }
    
    double get_double() {
        if (datatype != DataType.DOUBLE) {
            System.err.println("[ERROR] The queue is supporting " + datatype + " data type!");
            return 0.0;
        }
        
        if (getloc == putloc) {
            System.out.println(" Queue is empty ");
            return (double) 0;
        }
        
        double out = internal_arr[getloc++];
        if (getloc == putloc) {
            getloc = putloc = 0;
        }
        return out;
    }
    
    // CHAR
    void put_char(char value) {
        if (datatype != DataType.CHAR) {
            System.err.println("[ERROR] The queue is supporting " + datatype + " data type!");
            return;
        }

        if (putloc == internal_arr.length) {
            System.out.println(" Queue is full ");
            return;
        }
        internal_arr[putloc++] = (double) value;
    }
    
    char get_char() {
        if (datatype != DataType.CHAR) {
            System.err.println("[ERROR] The queue is supporting " + datatype + " data type!");
            return '\u0000';
        }

        if (getloc == putloc) {
            System.out.println(" Queue is empty ");
            return (char) 0;
        }
        
        char out = (char) internal_arr[getloc++];
        if (getloc == putloc) {
            getloc = putloc = 0;
        }
        return out;
    }
    
    // INT
    void put_int(int value) {
        if (datatype != DataType.INT) {
            System.err.println("[ERROR] The queue is supporting " + datatype + " data type!");
            return;
        }

        if (putloc == internal_arr.length) {
            System.out.println(" Queue is full ");
            return;
        }
        internal_arr[putloc++] = (double) value;
    }
    
    int get_int() {
        if (datatype != DataType.INT) {
            System.err.println("[ERROR] The queue is supporting " + datatype + " data type!");
            return 0;
        }

        if (getloc == putloc) {
            System.out.println(" Queue is empty ");
            return (int) 0;
        }
        
        int out = (int) internal_arr[getloc++];
        if (getloc == putloc) {
            getloc = putloc = 0;
        }
        return out;
    }


}
