// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeAttackAnalysisDataResponseBody extends TeaModel {
    /**
     * <p>The attack events. Valid values:</p>
     * <ul>
     * <li><p><strong>client_url</strong>: the URL of the attack request.</p>
     * </li>
     * <li><p><strong>internetIp</strong>: the IP address of the asset.</p>
     * </li>
     * <li><p><strong>instanceName</strong>: the name of the asset.</p>
     * </li>
     * <li><p><strong>table_src</strong>: the data source.</p>
     * </li>
     * <li><p><strong>uuid</strong>: the UUID of the asset.</p>
     * </li>
     * <li><p><strong>crack_method</strong>: the method of the attack request.</p>
     * </li>
     * <li><p><strong>crack_hour</strong>: the attack time.</p>
     * </li>
     * <li><p><strong>crack_src_ip</strong>: the IP address from which the attack is launched.</p>
     * </li>
     * <li><p><strong>instanceId</strong>: the ID of the asset.</p>
     * </li>
     * <li><p><strong>dst_port</strong>: the attacked port.</p>
     * </li>
     * <li><p><strong>client_ip</strong>: the attacked IP address.</p>
     * </li>
     * <li><p><strong>location</strong>: the region from which the attack is launched.</p>
     * </li>
     * <li><p><strong>aliuid</strong>: the ID of the Alibaba Cloud account.</p>
     * </li>
     * <li><p><strong>crack_cnt</strong>: the number of times that the attack is launched.</p>
     * </li>
     * <li><p><strong>crack_type</strong>: the type of the attack. Valid values:</p>
     * <ul>
     * <li><p><strong>113</strong>: improper authorization.</p>
     * </li>
     * <li><p><strong>112</strong>: redirection attack.</p>
     * </li>
     * <li><p><strong>upload</strong>: vulnerability upload.</p>
     * </li>
     * <li><p><strong>other</strong>: others.</p>
     * </li>
     * <li><p><strong>webshell</strong>: trojan script.</p>
     * </li>
     * <li><p><strong>201</strong>: suspicious connection.</p>
     * </li>
     * <li><p><strong>9</strong>: brute-force attack on Microsoft SQL Server.</p>
     * </li>
     * <li><p><strong>5</strong>: SSH brute-force attack.</p>
     * </li>
     * <li><p><strong>6</strong>: RDP brute-force attack.</p>
     * </li>
     * <li><p><strong>lfi</strong>: local file inclusion.</p>
     * </li>
     * <li><p><strong>7</strong>: code execution.</p>
     * </li>
     * <li><p><strong>sqli</strong>: SQL injection.</p>
     * </li>
     * <li><p><strong>209</strong>: web attack.</p>
     * </li>
     * <li><p><strong>31</strong>: buffer overflow.</p>
     * </li>
     * <li><p><strong>3</strong>: brute-force attack on MySQL.</p>
     * </li>
     * <li><p><strong>30</strong>: clickjacking.</p>
     * </li>
     * <li><p><strong>4</strong>: FTP brute-force attack.</p>
     * </li>
     * <li><p><strong>bypass</strong>: unauthorized access.</p>
     * </li>
     * <li><p><strong>33</strong>: format string.</p>
     * </li>
     * <li><p><strong>deeplearning</strong>: others.</p>
     * </li>
     * <li><p><strong>32</strong>: integer overflow.</p>
     * </li>
     * <li><p><strong>203</strong>: brute-force attack.</p>
     * </li>
     * <li><p><strong>34</strong>: race condition.</p>
     * </li>
     * <li><p><strong>rfi</strong>: remote file inclusion.</p>
     * </li>
     * <li><p><strong>0</strong>: SQL injection attack.</p>
     * </li>
     * <li><p><strong>212</strong>: mining behavior.</p>
     * </li>
     * <li><p><strong>213</strong>: reverse shell.</p>
     * </li>
     * <li><p><strong>211</strong>: worm.</p>
     * </li>
     * <li><p><strong>61</strong>: session timeout.</p>
     * </li>
     * <li><p><strong>20</strong>: directory traversal.</p>
     * </li>
     * <li><p><strong>xss</strong>: XSS attack.</p>
     * </li>
     * <li><p><strong>22</strong>: unauthorized access.</p>
     * </li>
     * <li><p><strong>21</strong>: scan attack.</p>
     * </li>
     * <li><p><strong>24</strong>: file modification.</p>
     * </li>
     * <li><p><strong>26</strong>: file deletion.</p>
     * </li>
     * <li><p><strong>25</strong>: file reading.</p>
     * </li>
     * <li><p><strong>28</strong>: CRLF injection.</p>
     * </li>
     * <li><p><strong>27</strong>: logic error.</p>
     * </li>
     * <li><p><strong>29</strong>: template injection.</p>
     * </li>
     * <li><p><strong>csrf</strong>: CSRF.</p>
     * </li>
     * <li><p><strong>path</strong>: directory traversal.</p>
     * </li>
     * <li><p><strong>crlf</strong>: CRLF.</p>
     * </li>
     * <li><p><strong>102</strong>: CSRF.</p>
     * </li>
     * <li><p><strong>103</strong>: server-side request forgery (SSRF).</p>
     * </li>
     * <li><p><strong>101</strong>: XSS.</p>
     * </li>
     * <li><p><strong>11</strong>: file inclusion.</p>
     * </li>
     * <li><p><strong>10</strong>: file upload.</p>
     * </li>
     * <li><p><strong>12</strong>: vulnerability upload.</p>
     * </li>
     * <li><p><strong>15</strong>: unauthorized access.</p>
     * </li>
     * <li><p><strong>14</strong>: information leakage.</p>
     * </li>
     * <li><p><strong>17</strong>: XML entity injection.</p>
     * </li>
     * <li><p><strong>16</strong>: insecure configuration.</p>
     * </li>
     * <li><p><strong>19</strong>: Lightweight Directory Access Protocol (LDAP) injection.</p>
     * </li>
     * <li><p><strong>18</strong>: XPath injection.</p>
     * </li>
     * <li><p><strong>codei</strong>: code execution.</p>
     * </li>
     * <li><p><strong>ai_webshell</strong>: intelligent defense against webshell upload.</p>
     * </li>
     * <li><p><strong>alinet_webrce</strong>: adaptive web attack defense.</p>
     * </li>
     * <li><p><strong>210</strong>: JSP webshell upload.</p>
     * </li>
     * <li><p><strong>161</strong>: webshell upload.</p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>[{\&quot;crack_hour\&quot;:1662480000000,\&quot;crack_cnt\&quot;:471},{\&quot;crack_hour\&quot;:1662483600000,\&quot;crack_cnt\&quot;:461},{\&quot;crack_hour\&quot;:1662487200000,\&quot;crack_cnt\&quot;:445},{\&quot;crack_hour\&quot;:1662490800000,\&quot;crack_cnt\&quot;:471},{\&quot;crack_hour\&quot;:1662494400000,\&quot;crack_cnt\&quot;:534},{\&quot;crack_hour\&quot;:1662498000000,\&quot;crack_cnt\&quot;:652},{\&quot;crack_hour\&quot;:1662501600000,\&quot;crack_cnt\&quot;:706},{\&quot;crack_hour\&quot;:1662505200000,\&quot;crack_cnt\&quot;:613},{\&quot;crack_hour\&quot;:1662508800000,\&quot;crack_cnt\&quot;:578},{\&quot;crack_hour\&quot;:1662512400000,\&quot;crack_cnt\&quot;:577},{\&quot;crack_hour\&quot;:1662516000000,\&quot;crack_cnt\&quot;:616},{\&quot;crack_hour\&quot;:1662519600000,\&quot;crack_cnt\&quot;:597},{\&quot;crack_hour\&quot;:1662523200000,\&quot;crack_cnt\&quot;:575},{\&quot;crack_hour\&quot;:1662526800000,\&quot;crack_cnt\&quot;:507}]</p>
     */
    @NameInMap("Data")
    public String data;

    /**
     * <p>The page number of the returned page.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Page")
    public Integer page;

    /**
     * <p>The number of entries returned per page. Default value: 10.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>4C1AE3F3-18FA-4108-BBB9-AFA1A032756C</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of attack events returned.</p>
     * 
     * <strong>example:</strong>
     * <p>1000</p>
     */
    @NameInMap("Total")
    public Integer total;

    public static DescribeAttackAnalysisDataResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAttackAnalysisDataResponseBody self = new DescribeAttackAnalysisDataResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAttackAnalysisDataResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public DescribeAttackAnalysisDataResponseBody setPage(Integer page) {
        this.page = page;
        return this;
    }
    public Integer getPage() {
        return this.page;
    }

    public DescribeAttackAnalysisDataResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeAttackAnalysisDataResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeAttackAnalysisDataResponseBody setTotal(Integer total) {
        this.total = total;
        return this;
    }
    public Integer getTotal() {
        return this.total;
    }

}
