package lt.infs;

public abstract class INF_App_config {

  //用户登录由服务器返回的token
  private static String Token;
  //信令流IPTLS是由信令流获取的）
  private static String CmdIp;
  //信令流端口
  private static String CmdPort;
  //文件流IP（非TLS是由信令流获取的）
  private static String FileIp;
  //文件流端口
  private static String FilePort;
  //当前连接序号
  private static String ST_fd;
  //当前连接序号对应的认证token
  private static String ST_tk;
  //超时时间20s
  private static int OutTime = 20000;

  public String getToken() {
    return Token;
  }

  public void setToken(String token) {
    Token = token;
  }

  public String getCmdIp() {
    return CmdIp;
  }

  public void setCmdIp(String cmdIp) {
    CmdIp = cmdIp;
  }

  public String getCmdPort() {
    return CmdPort;
  }

  public void setCmdPort(String cmdPort) {
    CmdPort = cmdPort;
  }

  public String getFileIp() {
    return FileIp;
  }

  public void setFileIp(String fileIp) {
    FileIp = fileIp;
  }

  public String getFilePort() {
    return FilePort;
  }

  public void setFilePort(String filePort) {
    FilePort = filePort;
  }

  public String getST_fd() {
    return ST_fd;
  }

  public void setST_fd(String ST_fd) {
    this.ST_fd = ST_fd;
  }

  public String getST_tk() {
    return ST_tk;
  }

  public void setST_tk(String ST_tk) {
    this.ST_tk = ST_tk;
  }

  public static int getOutTime() {
    return OutTime;
  }

  public static void setOutTime(int outTime) {
    OutTime = outTime;
  }
}
