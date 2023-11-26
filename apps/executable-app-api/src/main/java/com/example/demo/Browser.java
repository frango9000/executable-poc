package com.example.demo;

import java.io.IOException;

public class Browser {

  public static void openUrl(String url) throws IOException {
    String os = System.getProperty("os.name").toLowerCase();
    Runtime rt = Runtime.getRuntime();
    if (os.contains("win")) {
      rt.exec("rundll32 url.dll,FileProtocolHandler " + url);
    } else if (os.contains("mac")) {
      rt.exec("open " + url);
    } else if (os.contains("nix") || os.contains("nux")) {
      String[] browsers = {"epiphany", "firefox", "mozilla", "konqueror",
        "netscape", "opera", "links", "lynx"};
      StringBuffer cmd = new StringBuffer();
      for (int i = 0; i < browsers.length; i++)
        cmd.append(i == 0 ? "" : " || ").append(browsers[i]).append(" \"").append(url).append("\" ");
      rt.exec(new String[]{"sh", "-c", cmd.toString()});
    }
  }
}
