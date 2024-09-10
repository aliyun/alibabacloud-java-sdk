// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeAttackAnalysisDataRequest extends TeaModel {
    /**
     * <p>Specifies whether to encode the value of the <strong>client_url</strong> field in the query results by using the Base64 algorithm. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: yes</li>
     * <li><strong>false</strong>: no</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Base64")
    public String base64;

    /**
     * <p>The number of the page to return. Pages start from page <strong>1</strong>.</p>
     * <blockquote>
     * <p> If the Type parameter is set to <strong>DETAILS</strong>, you must specify the CurrentPage parameter.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>The condition that is used to filter attack events.</p>
     * <blockquote>
     * <p> The following list describes the valid values of crack_type:</p>
     * </blockquote>
     * <ul>
     * <li><p>3: brute-force attack on MySQL</p>
     * </li>
     * <li><p>4: FTP brute-force attack</p>
     * </li>
     * <li><p>5: SSH brute-force attack</p>
     * </li>
     * <li><p>6: RDP brute-force attack</p>
     * </li>
     * <li><p>9: brute-force attack on Microsoft SQL Server</p>
     * </li>
     * <li><p>101: intercepted attack on Java Struts 2</p>
     * </li>
     * <li><p>102: intercepted attack on Redis</p>
     * </li>
     * <li><p>103: communication with AntSword Webshell</p>
     * </li>
     * <li><p>104: communication with China Chopper Webshell</p>
     * </li>
     * <li><p>133: communication with XISE Webshell</p>
     * </li>
     * <li><p>sqli: SQL injection</p>
     * </li>
     * <li><p>codei: code execution</p>
     * </li>
     * <li><p>xss: cross-site scripting (XSS)</p>
     * </li>
     * <li><p>lfi: local file inclusion</p>
     * </li>
     * <li><p>rfi: remote file inclusion</p>
     * </li>
     * <li><p>webshell: trojan script</p>
     * </li>
     * <li><p>upload: vulnerability upload</p>
     * </li>
     * <li><p>path: directory traversal</p>
     * </li>
     * <li><p>bypass: unauthorized access</p>
     * </li>
     * <li><p>csrf: cross-site request forgery (CSRF)</p>
     * </li>
     * <li><p>crlf: carriage return line feed (CRLF)</p>
     * </li>
     * <li><p>other: others</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>{&quot;crack_type&quot;:&quot;9&quot;}</p>
     */
    @NameInMap("Data")
    public String data;

    /**
     * <p>The timestamp when the attack stops. Unit: seconds.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1649040221</p>
     */
    @NameInMap("EndTime")
    public Long endTime;

    /**
     * <p>The language of the content within the request and response. Default value: <strong>zh</strong>. Valid values:</p>
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
     * <p>The number of entries to return on each page.</p>
     * <blockquote>
     * <p> If the Type parameter is set to <strong>DETAILS</strong>, you must specify the PageSize parameter.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The timestamp at which the attack starts. By default, the statistics of the previous seven days are queried. Unit: seconds.</p>
     * <blockquote>
     * <p> The start time that you specify must be within the previous 40 days.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1644027670</p>
     */
    @NameInMap("StartTime")
    public Long startTime;

    /**
     * <p>The details of attack analysis. Valid values:</p>
     * <ul>
     * <li><strong>TOTAL</strong>: number of attacks</li>
     * <li><strong>TREND</strong>: attack trend</li>
     * <li><strong>PIE_CHART</strong>: distribution of attacks by type</li>
     * <li><strong>SOURCE_TOP</strong>: top 5 attack sources</li>
     * <li><strong>CLIENT_TOP</strong>: top 5 attacked assets</li>
     * <li><strong>DETAILS</strong>: attack details</li>
     * </ul>
     * <blockquote>
     * <p> If the Type parameter is set to <strong>DETAILS</strong>, you must specify the CurrentPage and PageSize parameters.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>DETAILS</p>
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
