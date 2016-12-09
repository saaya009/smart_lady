package com.sl;

import java.util.ArrayList;

import static sl.util.Log.log;

public class TestMain {

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
    byte dataTypeLenth = length.byteValue();
    log(dataTypeLenth & 0xff);
    sb.append(dataTypeLenth);
    sb.append(dataType);
    Integer dataLenth = data.length();
    byte[] dataTotalBytes = intToByteArray1(dataLenth);
    for (byte b : dataTotalBytes) {
      sb.append(b);
    }
    Integer size = list.size();
    sb.append(size.byteValue());
    for (TestBean test : list) {
      String name = test.getName();
      Integer name_lenth = name.length();
      String detail = test.getDetail();
      Integer detail_lenth = detail.length();
      sb.append(name_lenth.byteValue());
      sb.append(detail_lenth.byteValue());
      sb.append(name);
      sb.append(detail);
    }
    sb.append(data);
    return sb.toString();
  }

  public static byte[] intToByteArray1(int i) {
    byte[] result = new byte[4];
    result[0] = (byte) ((i >> 24) & 0xFF);
    result[1] = (byte) ((i >> 16) & 0xFF);
    result[2] = (byte) ((i >> 8) & 0xFF);
    result[3] = (byte) (i & 0xFF);
    return result;
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
