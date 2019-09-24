package com.atguigu.test.demo.fanxiang;

import java.util.*;

public class shuzhu {

    public static void main(String[] args) {

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
        System.out.println(a);
        Iterator<Integer> itor1 = list.iterator();
        while (itor1.hasNext()) {
            if (itor1.next() == a) {
                itor1.remove();
            }
        }

        List<List<Integer>> list2 = Arrays.asList(list);
        int n2 = random.nextInt(list2.size());
        int b = list.get(n2);
        System.out.println(b);
        Iterator<Integer> itor2 = list.iterator();
        while (itor2.hasNext()) {
            if (itor2.next() == a) {
                itor2.remove();
            }
        }

//        int n3 = random.nextInt(list.size());
//        int c = list.get(n3);
//        System.out.println(c);
//        Iterator<Integer> itor3 = list.iterator();
//        while (itor3.hasNext()) {
//            if (itor3.next() == a) {
//                itor3.remove();
//            }
//        }
//
//        int n4 = random.nextInt(list.size());
//        int d = list.get(n4);
//        System.out.println(d);
//        Iterator<Integer> itor4 = list.iterator();
//        while (itor4.hasNext()) {
//            if (itor4.next() == a) {
//                itor4.remove();
//            }
//        }
//
//        int n5 = random.nextInt(list.size());
//        int e = list.get(n5);
//        System.out.println(e);
//        Iterator<Integer> itor5 = list.iterator();
//        while (itor5.hasNext()) {
//            if (itor5.next() == a) {
//                itor5.remove();
//            }
//        }
//
//        int n6 = random.nextInt(list.size());
//        int f = list.get(n6);
//        System.out.println(f);
//        Iterator<Integer> itor6 = list.iterator();
//        while (itor6.hasNext()) {
//            if (itor6.next() == a) {
//                itor6.remove();
//            }
//        }
//
//        System.out.println("============");
//
//        List<Integer> list2 = new ArrayList<>();
//        list2.add(1);
//        list2.add(2);
//        list2.add(3);
//        list2.add(4);
//        list2.add(5);
//        list2.add(6);
//        list2.add(7);
//        list2.add(8);
//        list2.add(9);
//        list2.add(10);
//        list2.add(11);
//        list2.add(12);
//        list2.add(13);
//        list2.add(14);
//        list2.add(15);
//        list2.add(16);
//
//        int n7 = random.nextInt(list2.size());
//        int g = list.get(n7);
//        System.out.println(g);

    }
}