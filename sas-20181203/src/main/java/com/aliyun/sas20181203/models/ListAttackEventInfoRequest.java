// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ListAttackEventInfoRequest extends TeaModel {
    /**
     * <p>Attacked asset. You can fill in the machine instance name, public IP, or private IP.</p>
     * 
     * <strong>example:</strong>
     * <p>instance_**</p>
     */
    @NameInMap("AttackInstance")
    public String attackInstance;

    /**
     * <p>Attack type. Values:</p>
     * <ul>
     * <li><p>9: SQL Server brute force attack</p>
     * </li>
     * <li><p>5: SSH brute force attack</p>
     * </li>
     * <li><p>6: RDP brute force attack</p>
     * </li>
     * <li><p>101: Java Struts2 attack interception</p>
     * </li>
     * <li><p>102: Redis attack interception</p>
     * </li>
     * <li><p>103: Chinese AntSword WebShell communication</p>
     * </li>
     * <li><p>104: Chinese Chopper WebShell communication</p>
     * </li>
     * <li><p>133: XISE WebShell communication</p>
     * </li>
     * <li><p>161: WebShell upload</p>
     * </li>
     * <li><p>209: PHP WebShell upload</p>
     * </li>
     * <li><p>210: JSP WebShell upload</p>
     * </li>
     * <li><p>211: ASP WebShell upload</p>
     * </li>
     * <li><p>215: Special suffix WebShell upload</p>
     * </li>
     * <li><p>ai_webshell: Intelligent defense for WebShell upload</p>
     * </li>
     * <li><p>java_common_rce: Java common RCE vulnerability interception</p>
     * </li>
     * <li><p>alinet_webrce: Adaptive web attack defense</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>9</p>
     */
    @NameInMap("AttackType")
    public String attackType;

    /**
     * <p>Page number to display in a paginated query.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>Target port of the attack.</p>
     * 
     * <strong>example:</strong>
     * <p>9085</p>
     */
    @NameInMap("DstPort")
    public String dstPort;

    /**
     * <p>Timestamp of the end time.</p>
     * 
     * <strong>example:</strong>
     * <p>1753152532550</p>
     */
    @NameInMap("EndTime")
    public Long endTime;

    /**
     * <p>Set the language type for request and response messages. Default is <strong>zh</strong>. Values:</p>
     * <ul>
     * <li><p><strong>zh</strong>: Chinese</p>
     * </li>
     * <li><p><strong>en</strong>: English</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>Maximum number of records per page in a paginated query.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>Source IP of the attack.</p>
     * 
     * <strong>example:</strong>
     * <p>185.237.96.***</p>
     */
    @NameInMap("SrcIp")
    public String srcIp;

    /**
     * <p>Timestamp of the start time.</p>
     * 
     * <strong>example:</strong>
     * <p>1752547732549</p>
     */
    @NameInMap("StartTime")
    public Long startTime;

    public static ListAttackEventInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        ListAttackEventInfoRequest self = new ListAttackEventInfoRequest();
        return TeaModel.build(map, self);
    }

    public ListAttackEventInfoRequest setAttackInstance(String attackInstance) {
        this.attackInstance = attackInstance;
        return this;
    }
    public String getAttackInstance() {
        return this.attackInstance;
    }

    public ListAttackEventInfoRequest setAttackType(String attackType) {
        this.attackType = attackType;
        return this;
    }
    public String getAttackType() {
        return this.attackType;
    }

    public ListAttackEventInfoRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public ListAttackEventInfoRequest setDstPort(String dstPort) {
        this.dstPort = dstPort;
        return this;
    }
    public String getDstPort() {
        return this.dstPort;
    }

    public ListAttackEventInfoRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public ListAttackEventInfoRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public ListAttackEventInfoRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListAttackEventInfoRequest setSrcIp(String srcIp) {
        this.srcIp = srcIp;
        return this;
    }
    public String getSrcIp() {
        return this.srcIp;
    }

    public ListAttackEventInfoRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

}
