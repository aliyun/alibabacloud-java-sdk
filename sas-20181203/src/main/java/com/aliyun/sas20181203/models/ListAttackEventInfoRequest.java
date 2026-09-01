// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ListAttackEventInfoRequest extends TeaModel {
    /**
     * <p>The attacked asset. You can specify the instance name, public IP address, or private IP address.</p>
     * 
     * <strong>example:</strong>
     * <p>instance_**</p>
     */
    @NameInMap("AttackInstance")
    public String attackInstance;

    /**
     * <p>The attack type. Valid values:</p>
     * <ul>
     * <li>9: SQL Server brute-force attacks</li>
     * <li>5: SSH brute-force attacks</li>
     * <li>6: RDP brute-force attacks</li>
     * <li>101: Java Struts2 attack blocked</li>
     * <li>102: Redis attack blocked</li>
     * <li>103: China Chopper (AntSword) WebShell communication</li>
     * <li>104: China Chopper WebShell communication</li>
     * <li>133: XISE WebShell communication</li>
     * <li>161: WebShell upload</li>
     * <li>209: PHP WebShell upload</li>
     * <li>210: JSP WebShell upload</li>
     * <li>211: ASP WebShell upload</li>
     * <li>215: Special extension WebShell upload</li>
     * <li>ai_webshell: WebShell upload intelligent defense</li>
     * <li>java_common_rce: Java common remote code execution (RCE) vulnerability blocked</li>
     * <li>alinet_webrce: Adaptive web attack defense</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>9</p>
     */
    @NameInMap("AttackType")
    public String attackType;

    /**
     * <p>The number of the page to return in a paged query.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>The Attack Target Ports of the Attack Target.</p>
     * 
     * <strong>example:</strong>
     * <p>9085</p>
     */
    @NameInMap("DstPort")
    public String dstPort;

    /**
     * <p>The timestamp of the end time.</p>
     * 
     * <strong>example:</strong>
     * <p>1753152532550</p>
     */
    @NameInMap("EndTime")
    public Long endTime;

    /**
     * <p>The language type for the request and response messages. Default value: <strong>zh</strong>. Valid values:</p>
     * <ul>
     * <li><strong>zh</strong>: Chinese</li>
     * <li><strong>en</strong>: English</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The maximum number of entries to return on each page in a paged query.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The Attack Source IP Addresses.</p>
     * 
     * <strong>example:</strong>
     * <p>185.237.96.***</p>
     */
    @NameInMap("SrcIp")
    public String srcIp;

    /**
     * <p>The timestamp of the start time.</p>
     * <p>This field is a UNIX timestamp. Unit: milliseconds.</p>
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
