// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeMonitorAccountsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeMonitorAccountsResponseBody body;

    public static DescribeMonitorAccountsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeMonitorAccountsResponse self = new DescribeMonitorAccountsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeMonitorAccountsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeMonitorAccountsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeMonitorAccountsResponse setBody(DescribeMonitorAccountsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeMonitorAccountsResponseBody getBody() {
        return this.body;
    }

}
