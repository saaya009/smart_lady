package com.sl;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;

import static sl.util.Log.log;

public class TestMain {

  //血氧
  //    血糖
  //体温
  //    心率
  //心电
  //    听诊器
  static String LTCFNIBP = "LTCFNIBP";
  static String LTCFSOP2 = "LTCFSOP2";
  static String LTCFFBG = "LTCFFBG";
  static String LTCFTEMP = "LTCFTEMP";
  static String LTCFHR = "LTCFHR";
  static String LTCFECG = "LTCFECG";
  static String LTCFSTE = "LTCFSTE";
  static String data =
      "\"diastolic\":65,\"heartrate\":80,\"systolic\":106,\"testuser\":\"13400640907\",\"time\":1477885555381";

  public static void main(String[] args) {
    ArrayList<TestBean> list = new ArrayList();
    list.add(new TestBean("diastolic", "65"));
    list.add(new TestBean("heartrate", "80"));
    list.add(new TestBean("systolic", "106"));
    log(doDataHeader(LTCFNIBP, data, list));
  }

  public static String doDataHeader(String dataType, String data, ArrayList<TestBean> list) {
    StringBuilder sb = new StringBuilder();
    Integer length = dataType.length();
    byte b = length.byteValue();
    log(b&0xff);
    sb.append(length);
    sb.append(dataType);
    sb.append(data.length());
    sb.append(list.size());
    for (TestBean test : list) {
      String name = test.getName();
      int name_lenth = name.length();
      String detail = test.getDetail();
      int detail_lenth = detail.length();
      sb.append(name_lenth);
      sb.append(detail_lenth);
      sb.append(name);
      sb.append(detail);
    }
    sb.append(data);
    return sb.toString();
  }

  public static class TestBean {
    private String name;
    private String detail;

    public TestBean(String name, String detail) {

      this.name = name;
      this.detail = detail;
    }

    public String getName() {
      return name;
    }

    public String getDetail() {
      return detail;
    }
  }
}
