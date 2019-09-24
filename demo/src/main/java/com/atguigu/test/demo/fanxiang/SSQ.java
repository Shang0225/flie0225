package com.atguigu.test.demo.fanxiang;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class SSQ {

    public static void main(String[] args) {

        for (int i = 1; i <= 100; i++) {
            List<Integer> list = new ArrayList<>();
            list.add(1);
            list.add(2);
            list.add(3);
            list.add(4);
            list.add(5);
            list.add(6);
            list.add(7);
            list.add(8);
            list.add(9);
            list.add(10);
            list.add(11);
            list.add(12);
            list.add(13);
            list.add(14);
            list.add(15);
            list.add(16);
            list.add(17);
            list.add(18);
            list.add(19);
            list.add(20);
            list.add(21);
            list.add(22);
            list.add(23);
            list.add(24);
            list.add(25);
            list.add(26);
            list.add(27);
            list.add(28);
            list.add(29);
            list.add(30);
            list.add(31);
            list.add(32);
            list.add(33);

            Random random = new Random();

            int n1 = random.nextInt(list.size());
            int a = list.get(n1);
            Iterator<Integer> itor1 = list.iterator();
            while (itor1.hasNext()) {
                if (itor1.next() == a) {
                    itor1.remove();
                }
            }

            int n2 = random.nextInt(list.size());
            int b = list.get(n2);
            Iterator<Integer> itor2 = list.iterator();
            while (itor2.hasNext()) {
                if (itor2.next() == b) {
                    itor2.remove();
                }
            }

            int n3 = random.nextInt(list.size());
            int c = list.get(n3);
            Iterator<Integer> itor3 = list.iterator();
            while (itor3.hasNext()) {
                if (itor3.next() == c) {
                    itor3.remove();
                }
            }

            int n4 = random.nextInt(list.size());
            int d = list.get(n4);
            Iterator<Integer> itor4 = list.iterator();
            while (itor4.hasNext()) {
                if (itor4.next() == d) {
                    itor4.remove();
                }
            }

            int n5 = random.nextInt(list.size());
            int e = list.get(n5);
            Iterator<Integer> itor5 = list.iterator();
            while (itor5.hasNext()) {
                if (itor5.next() == e) {
                    itor5.remove();
                }
            }

            int n6 = random.nextInt(list.size());
            int f = list.get(n6);

            List<Integer> list2 = new ArrayList<>();
            list2.add(1);
            list2.add(2);
            list2.add(3);
            list2.add(4);
            list2.add(5);
            list2.add(6);
            list2.add(7);
            list2.add(8);
            list2.add(9);
            list2.add(10);
            list2.add(11);
            list2.add(12);
            list2.add(13);
            list2.add(14);
            list2.add(15);
            list2.add(16);

            int n7 = random.nextInt(list2.size());
            int g = list2.get(n7);


            if ((a == 2 || b == 2 || c == 2 || d == 2 || e == 2 || f == 2) && (a == 6 || b == 6 || c == 6 || d == 6 || e == 6 || f == 6) && (a == 8 || b == 8 || c == 8 || d == 8 || e == 8 || f == 8)) {
                System.out.println(a);
                System.out.println(b);
                System.out.println(c);
                System.out.println(d);
                System.out.println(e);
                System.out.println(f);
                System.out.println("============");
                System.out.println(g);
            } else {
                System.out.println("-----失败-----");
            }
        }
    }
}