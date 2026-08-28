// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeApplicationSSLResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeApplicationSSLResponseBody body;

    public static DescribeApplicationSSLResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeApplicationSSLResponse self = new DescribeApplicationSSLResponse();
        return TeaModel.build(map, self);
    }

    public DescribeApplicationSSLResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeApplicationSSLResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeApplicationSSLResponse setBody(DescribeApplicationSSLResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeApplicationSSLResponseBody getBody() {
        return this.body;
    }

}
