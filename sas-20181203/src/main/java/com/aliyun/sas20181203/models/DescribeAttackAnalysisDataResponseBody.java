// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeAttackAnalysisDataResponseBody extends TeaModel {
    /**
     * <p>The attack events. The value contains the following fields:</p>
     * <br>
     * <p>*   **client_url**: the URL of the attack request.</p>
     * <br>
     * <p>*   **internetIp**: the IP address of the asset.</p>
     * <br>
     * <p>*   **instanceName**: the name of the asset.</p>
     * <br>
     * <p>*   **table_src**: the source of data.</p>
     * <br>
     * <p>*   **uuid**: the UUID of the asset.</p>
     * <br>
     * <p>*   **crack_method**: the method of the attack request.</p>
     * <br>
     * <p>*   **crack_hour**: the attack time.</p>
     * <br>
     * <p>*   **crack_src_ip**: the IP address from which the attack is launched.</p>
     * <br>
     * <p>*   **instanceId**: the ID of the asset.</p>
     * <br>
     * <p>*   **dst_port**: the attacked port.</p>
     * <br>
     * <p>*   **client_ip**: the attacked IP address.</p>
     * <br>
     * <p>*   **location**: the region from which the attack is launched.</p>
     * <br>
     * <p>*   **aliuid**: the ID of the Alibaba Cloud account.</p>
     * <br>
     * <p>*   **crack_cnt**: the number of times that the attack is launched.</p>
     * <br>
     * <p>*   **crack_type**: the type of the attack. Valid values:</p>
     * <br>
     * <p>    *   **113**: improper authorization</p>
     * <p>    *   **112**: redirection attack</p>
     * <p>    *   **upload**: vulnerability upload</p>
     * <p>    *   **other**: others</p>
     * <p>    *   **webshell**: trojan script</p>
     * <p>    *   **201**: suspicious connection</p>
     * <p>    *   **9**: brute-force attack on Microsoft SQL Server</p>
     * <p>    *   **5**: SSH brute-force attack</p>
     * <p>    *   **6**: RDP brute-force attack</p>
     * <p>    *   **lfi**: local file inclusion</p>
     * <p>    *   **7**: code execution</p>
     * <p>    *   **sqli**: SQL injection</p>
     * <p>    *   **209**: web attack</p>
     * <p>    *   **31**: buffer overflow</p>
     * <p>    *   **3**: brute-force attack on MySQL</p>
     * <p>    *   **30**: clickjacking</p>
     * <p>    *   **4**: FTP brute-force attack</p>
     * <p>    *   **bypass**: unauthorized access</p>
     * <p>    *   **33**: format string</p>
     * <p>    *   **deeplearning**: others</p>
     * <p>    *   **32**: integer overflow</p>
     * <p>    *   **203**: brute-force attack</p>
     * <p>    *   **34**: race condition</p>
     * <p>    *   **rfi**: remote file inclusion</p>
     * <p>    *   **0**: SQL injection</p>
     * <p>    *   **212**: mining behavior</p>
     * <p>    *   **213**: reverse shell</p>
     * <p>    *   **211**: worm</p>
     * <p>    *   **61**: session timeout</p>
     * <p>    *   **20**: directory traversal</p>
     * <p>    *   **xss**: XSS</p>
     * <p>    *   **22**: unauthorized access</p>
     * <p>    *   **21**: scan attack</p>
     * <p>    *   **24**: file modification</p>
     * <p>    *   **26**: file deletion</p>
     * <p>    *   **25**: file reading</p>
     * <p>    *   **28**: CRLF injection</p>
     * <p>    *   **27**: logic error</p>
     * <p>    *   **29**: template injection</p>
     * <p>    *   **csrf**: CSRF</p>
     * <p>    *   **path**: directory traversal</p>
     * <p>    *   **crlf**: CRLF</p>
     * <p>    *   **102**: CSRF</p>
     * <p>    *   **103**: server-side request forgery (SSRF)</p>
     * <p>    *   **101**: XSS</p>
     * <p>    *   **11**: file inclusion</p>
     * <p>    *   **10**: file upload</p>
     * <p>    *   **12**: vulnerability upload</p>
     * <p>    *   **15**: unauthorized access</p>
     * <p>    *   **14**: information leakage</p>
     * <p>    *   **17**: XML entity injection</p>
     * <p>    *   **16**: insecure configuration</p>
     * <p>    *   **19**: Lightweight Directory Access Protocol (LDAP) injection</p>
     * <p>    *   **18**: XPath injection</p>
     * <p>    *   **codei**: code execution</p>
     */
    @NameInMap("Data")
    public String data;

    /**
     * <p>The page number of the returned page.</p>
     */
    @NameInMap("Page")
    public Integer page;

    /**
     * <p>The number of entries returned per page. Default value: 10.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of attack events returned.</p>
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
