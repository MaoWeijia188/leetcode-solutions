package leetcode-solutions.tree;

import java.PriorityQueue;
import java.util.Scanner;

public class pta_haffmantree {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        java.util.PriorityQueue<Long> pq= new PriorityQueue<>():
        for(int i=0;i<n;i++){
            pq.add(sc.nextLong());
        })
        long wpl=0;
        while(pq.size()>1){
            long a=pq.poll();
            long b=pq.poll()
            long sum=a+b;
            wpl+=sum;
            pq.add(sum);        
        }
        System.out.println(wpl);
        sc.close;
    }    
}
