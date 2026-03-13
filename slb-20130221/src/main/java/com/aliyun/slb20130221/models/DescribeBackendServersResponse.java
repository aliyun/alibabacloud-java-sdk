// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.slb20130221.models;

import com.aliyun.tea.*;

public class DescribeBackendServersResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeBackendServersResponseBody body;

    public static DescribeBackendServersResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeBackendServersResponse self = new DescribeBackendServersResponse();
        return TeaModel.build(map, self);
    }

    public DescribeBackendServersResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeBackendServersResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeBackendServersResponse setBody(DescribeBackendServersResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeBackendServersResponseBody getBody() {
        return this.body;
    }

}
