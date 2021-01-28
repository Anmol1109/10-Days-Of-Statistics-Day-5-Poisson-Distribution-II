import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        DecimalFormat df = new DecimalFormat("##0.000");
        System.out.println(df.format(160 + 40 * (0.88 * 0.88 + 0.88)));
        System.out.println(df.format(128 + 40 * (1.55 * 1.55 + 1.55)));
    }
}
