// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sgw20180511.models;

import com.aliyun.tea.*;

public class DescribeGatewayDNSResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("DnsServer")
    public String dnsServer;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static DescribeGatewayDNSResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeGatewayDNSResponseBody self = new DescribeGatewayDNSResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeGatewayDNSResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeGatewayDNSResponseBody setDnsServer(String dnsServer) {
        this.dnsServer = dnsServer;
        return this;
    }
    public String getDnsServer() {
        return this.dnsServer;
    }

    public DescribeGatewayDNSResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeGatewayDNSResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeGatewayDNSResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
