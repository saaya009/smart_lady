package com.sl;

import java.util.Arrays;
import java.util.Scanner;
import java.util.prefs.BackingStoreException;

import static sl.util.Log.log;
import static sl.util.Log.notice;
import static sl.util.Numeric.str2int;

public class SmartLady_Main {

  static int[] i1 = new int[10];
  static int[] i2 = new int[10];
  static int[] i3 = new int[10];
  static int[] i4 = new int[10];
  static int[] i5 = new int[10];
  static int[] outIn = new int[5];

  public static void main(String[] args) throws BackingStoreException {
    initArrays();
    SystemIn();

  }

  private static void SystemIn() {
    notice("1");
    log("");
    Scanner sc = new Scanner(System.in);
    String s1 = sc.nextLine();
    notice("2");
    log("");
    String s2 = sc.nextLine();
    notice("3");
    log("");
    String s3 = sc.nextLine();
    notice("4");
    log("");
    String s4 = sc.nextLine();
    notice("5");
    log("");
    String s5 = sc.nextLine();
    outIn[0] = str2int(s1);
    outIn[1] = str2int(s2);
    outIn[2] = str2int(s3);
    outIn[3] = str2int(s4);
    outIn[4] = str2int(s5);
    log(Arrays.toString(outIn));
  }

  private static void initArrays() {
    for (int i = 0; i < 10; i++) {
      i1[i] = i;
      i2[i] = i;
      i3[i] = i;
      i4[i] = i;
      i5[i] = i;
    }
  }
}
