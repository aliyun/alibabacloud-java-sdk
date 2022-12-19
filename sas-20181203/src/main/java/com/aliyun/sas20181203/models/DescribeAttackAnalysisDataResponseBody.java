// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeAttackAnalysisDataResponseBody extends TeaModel {
    // The attack events. The value contains the following fields:
    // 
    // *   **client_url**: the URL of the attack request.
    // 
    // *   **internetIp**: the IP address of the asset.
    // 
    // *   **instanceName**: the name of the asset.
    // 
    // *   **table_src**: the source of data.
    // 
    // *   **uuid**: the UUID of the asset.
    // 
    // *   **crack_method**: the method of the attack request.
    // 
    // *   **crack_hour**: the attack time.
    // 
    // *   **crack_src_ip**: the IP address from which the attack is launched.
    // 
    // *   **instanceId**: the ID of the asset.
    // 
    // *   **dst_port**: the attacked port.
    // 
    // *   **client_ip**: the attacked IP address.
    // 
    // *   **location**: the region from which the attack is launched.
    // 
    // *   **aliuid**: the ID of the Alibaba Cloud account.
    // 
    // *   **crack_cnt**: the number of times that the attack is launched.
    // 
    // *   **crack_type**: the type of the attack. Valid values:
    // 
    //     *   **113**: improper authorization
    //     *   **112**: redirection attack
    //     *   **upload**: vulnerability upload
    //     *   **other**: others
    //     *   **webshell**: trojan script
    //     *   **201**: suspicious connection
    //     *   **9**: brute-force attack on Microsoft SQL Server
    //     *   **5**: SSH brute-force attack
    //     *   **6**: RDP brute-force attack
    //     *   **lfi**: local file inclusion
    //     *   **7**: code execution
    //     *   **sqli**: SQL injection
    //     *   **209**: web attack
    //     *   **31**: buffer overflow
    //     *   **3**: brute-force attack on MySQL
    //     *   **30**: clickjacking
    //     *   **4**: FTP brute-force attack
    //     *   **bypass**: unauthorized access
    //     *   **33**: format string
    //     *   **deeplearning**: others
    //     *   **32**: integer overflow
    //     *   **203**: brute-force attack
    //     *   **34**: race condition
    //     *   **rfi**: remote file inclusion
    //     *   **0**: SQL injection
    //     *   **212**: mining behavior
    //     *   **213**: reverse shell
    //     *   **211**: worm
    //     *   **61**: session timeout
    //     *   **20**: directory traversal
    //     *   **xss**: XSS
    //     *   **22**: unauthorized access
    //     *   **21**: scan attack
    //     *   **24**: file modification
    //     *   **26**: file deletion
    //     *   **25**: file reading
    //     *   **28**: CRLF injection
    //     *   **27**: logic error
    //     *   **29**: template injection
    //     *   **csrf**: CSRF
    //     *   **path**: directory traversal
    //     *   **crlf**: CRLF
    //     *   **102**: CSRF
    //     *   **103**: server-side request forgery (SSRF)
    //     *   **101**: XSS
    //     *   **11**: file inclusion
    //     *   **10**: file upload
    //     *   **12**: vulnerability upload
    //     *   **15**: unauthorized access
    //     *   **14**: information leakage
    //     *   **17**: XML entity injection
    //     *   **16**: insecure configuration
    //     *   **19**: Lightweight Directory Access Protocol (LDAP) injection
    //     *   **18**: XPath injection
    //     *   **codei**: code execution
    @NameInMap("Data")
    public String data;

    // The page number of the returned page.
    @NameInMap("Page")
    public Integer page;

    // The number of entries returned per page. Default value: 10.
    @NameInMap("PageSize")
    public Integer pageSize;

    // The ID of the request, which is used to locate and troubleshoot issues.
    @NameInMap("RequestId")
    public String requestId;

    // The total number of attack events returned.
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
