/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filereader;

/**
 *
 * @author aysenurdeniz
 */
public class FileInfo {

    private String ipInfo;
    private String portNo;
    private final String filePath = "C:\\Users\\aysenurdeniz\\Documents\\NetBeansProjects\\FileReader\\src\\file\\read.txt";

    public FileInfo() {
    }

    public String getIpInfo() {
        return ipInfo;
    }

    public void setIpInfo(String ipInfo) {
        this.ipInfo = ipInfo;
    }

    public String getPortNo() {
        return portNo;
    }

    public void setPortNo(String portNo) {
        this.portNo = portNo;
    }

    public String getFilePath() {
        return filePath;
    }

}
