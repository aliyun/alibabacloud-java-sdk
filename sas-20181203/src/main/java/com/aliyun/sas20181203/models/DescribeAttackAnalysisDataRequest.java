// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeAttackAnalysisDataRequest extends TeaModel {
    // Specifies whether to encode the value of the **client_url** field in the query results by using the Base64 algorithm. Valid values:
    // 
    // *   **true**: yes
    // *   **false**: no
    @NameInMap("Base64")
    public String base64;

    // The number of the page to return. Pages start from page **1**.
    // 
    // >  If the Type parameter is set to **DETAILS**, you must specify the CurrentPage parameter.
    @NameInMap("CurrentPage")
    public Integer currentPage;

    // The condition that is used to filter attack events.
    // 
    // >  The following list describes the valid values of crack_type:
    // 
    // *   3: brute-force attack on MySQL
    // 
    // *   4: FTP brute-force attack
    // 
    // *   5: SSH brute-force attack
    // 
    // *   6: RDP brute-force attack
    // 
    // *   9: brute-force attack on Microsoft SQL Server
    // 
    // *   101: intercepted attack on Java Struts 2
    // 
    // *   102: intercepted attack on Redis
    // 
    // *   103: communication with AntSword Webshell
    // 
    // *   104: communication with China Chopper Webshell
    // 
    // *   133: communication with XISE Webshell
    // 
    // *   sqli: SQL injection
    // 
    // *   codei: code execution
    // 
    // *   xss: cross-site scripting (XSS)
    // 
    // *   lfi: local file inclusion
    // 
    // *   rfi: remote file inclusion
    // 
    // *   webshell: trojan script
    // 
    // *   upload: vulnerability upload
    // 
    // *   path: directory traversal
    // 
    // *   bypass: unauthorized access
    // 
    // *   csrf: cross-site request forgery (CSRF)
    // 
    // *   crlf: carriage return line feed (CRLF)
    // 
    // *   other: others
    @NameInMap("Data")
    public String data;

    // The timestamp when the attack stops. Unit: seconds.
    @NameInMap("EndTime")
    public Long endTime;

    // The language of the content within the request and response. Default value: **zh**. Valid values:
    // 
    // *   **zh**: Chinese
    // *   **en**: English
    @NameInMap("Lang")
    public String lang;

    // The number of entries to return on each page.
    // 
    // >  If the Type parameter is set to **DETAILS**, you must specify the PageSize parameter.
    @NameInMap("PageSize")
    public Integer pageSize;

    // The timestamp at which the attack starts. By default, the statistics of the previous seven days are queried. Unit: seconds.
    // 
    // >  The start time that you specify must be within the previous 40 days.
    @NameInMap("StartTime")
    public Long startTime;

    // The details of attack analysis. Valid values:
    // 
    // *   **TOTAL**: number of attacks
    // *   **TREND**: attack trend
    // *   **PIE_CHART**: distribution of attacks by type
    // *   **SOURCE_TOP**: top 5 attack sources
    // *   **CLIENT_TOP**: top 5 attacked assets
    // *   **DETAILS**: attack details
    // 
    // >  If the Type parameter is set to **DETAILS**, you must specify the CurrentPage and PageSize parameters.
    @NameInMap("Type")
    public String type;

    public static DescribeAttackAnalysisDataRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeAttackAnalysisDataRequest self = new DescribeAttackAnalysisDataRequest();
        return TeaModel.build(map, self);
    }

    public DescribeAttackAnalysisDataRequest setBase64(String base64) {
        this.base64 = base64;
        return this;
    }
    public String getBase64() {
        return this.base64;
    }

    public DescribeAttackAnalysisDataRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public DescribeAttackAnalysisDataRequest setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public DescribeAttackAnalysisDataRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public DescribeAttackAnalysisDataRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeAttackAnalysisDataRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeAttackAnalysisDataRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

    public DescribeAttackAnalysisDataRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
