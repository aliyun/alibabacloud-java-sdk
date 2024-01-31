// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeAgentInstallStatusResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeAgentInstallStatusResponseBody body;

    public static DescribeAgentInstallStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeAgentInstallStatusResponse self = new DescribeAgentInstallStatusResponse();
        return TeaModel.build(map, self);
    }

    public DescribeAgentInstallStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeAgentInstallStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeAgentInstallStatusResponse setBody(DescribeAgentInstallStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeAgentInstallStatusResponseBody getBody() {
        return this.body;
    }

}
