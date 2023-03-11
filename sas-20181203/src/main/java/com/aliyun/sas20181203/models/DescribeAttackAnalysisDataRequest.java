// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeAttackAnalysisDataRequest extends TeaModel {
    /**
     * <p>Specifies whether to encode the value of the **client_url** field in the query results by using the Base64 algorithm. Valid values:</p>
     * <br>
     * <p>*   **true**: yes</p>
     * <p>*   **false**: no</p>
     */
    @NameInMap("Base64")
    public String base64;

    /**
     * <p>The number of the page to return. Pages start from page **1**.</p>
     * <br>
     * <p>>  If the Type parameter is set to **DETAILS**, you must specify the CurrentPage parameter.</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>The condition that is used to filter attack events.</p>
     * <br>
     * <p>>  The following list describes the valid values of crack_type:</p>
     * <br>
     * <p>*   3: brute-force attack on MySQL</p>
     * <br>
     * <p>*   4: FTP brute-force attack</p>
     * <br>
     * <p>*   5: SSH brute-force attack</p>
     * <br>
     * <p>*   6: RDP brute-force attack</p>
     * <br>
     * <p>*   9: brute-force attack on Microsoft SQL Server</p>
     * <br>
     * <p>*   101: intercepted attack on Java Struts 2</p>
     * <br>
     * <p>*   102: intercepted attack on Redis</p>
     * <br>
     * <p>*   103: communication with AntSword Webshell</p>
     * <br>
     * <p>*   104: communication with China Chopper Webshell</p>
     * <br>
     * <p>*   133: communication with XISE Webshell</p>
     * <br>
     * <p>*   sqli: SQL injection</p>
     * <br>
     * <p>*   codei: code execution</p>
     * <br>
     * <p>*   xss: cross-site scripting (XSS)</p>
     * <br>
     * <p>*   lfi: local file inclusion</p>
     * <br>
     * <p>*   rfi: remote file inclusion</p>
     * <br>
     * <p>*   webshell: trojan script</p>
     * <br>
     * <p>*   upload: vulnerability upload</p>
     * <br>
     * <p>*   path: directory traversal</p>
     * <br>
     * <p>*   bypass: unauthorized access</p>
     * <br>
     * <p>*   csrf: cross-site request forgery (CSRF)</p>
     * <br>
     * <p>*   crlf: carriage return line feed (CRLF)</p>
     * <br>
     * <p>*   other: others</p>
     */
    @NameInMap("Data")
    public String data;

    /**
     * <p>The timestamp when the attack stops. Unit: seconds.</p>
     */
    @NameInMap("EndTime")
    public Long endTime;

    /**
     * <p>The language of the content within the request and response. Default value: **zh**. Valid values:</p>
     * <br>
     * <p>*   **zh**: Chinese</p>
     * <p>*   **en**: English</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The number of entries to return on each page.</p>
     * <br>
     * <p>>  If the Type parameter is set to **DETAILS**, you must specify the PageSize parameter.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The timestamp at which the attack starts. By default, the statistics of the previous seven days are queried. Unit: seconds.</p>
     * <br>
     * <p>>  The start time that you specify must be within the previous 40 days.</p>
     */
    @NameInMap("StartTime")
    public Long startTime;

    /**
     * <p>The details of attack analysis. Valid values:</p>
     * <br>
     * <p>*   **TOTAL**: number of attacks</p>
     * <p>*   **TREND**: attack trend</p>
     * <p>*   **PIE_CHART**: distribution of attacks by type</p>
     * <p>*   **SOURCE_TOP**: top 5 attack sources</p>
     * <p>*   **CLIENT_TOP**: top 5 attacked assets</p>
     * <p>*   **DETAILS**: attack details</p>
     * <br>
     * <p>>  If the Type parameter is set to **DETAILS**, you must specify the CurrentPage and PageSize parameters.</p>
     */
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
