package com.company;


import java.util.Arrays;

public class Main {

    public static void main(String[] args)
    {

        int numReals = Integer.parseInt(args[0]);
        int ndx;

        double[] arr = new double[numReals];

        for (ndx = 0; ndx < numReals; ndx++)
        {
            arr[ndx] = Double.parseDouble(args[ndx+1]);
        }

        double highVal = Double.parseDouble(args[++ndx]);
        int subsetSize = Integer.parseInt(args[++ndx]);

        Arrays.sort(arr);

        int count = 0;

        for (int index = 0; index < subsetSize; index++)
        {
            count += arr[index];
        }

        System.out.println(count < highVal);
    }


}
