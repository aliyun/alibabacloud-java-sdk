// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class DescribeDBInstanceSSLResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeDBInstanceSSLResponseBody body;

    public static DescribeDBInstanceSSLResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDBInstanceSSLResponse self = new DescribeDBInstanceSSLResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDBInstanceSSLResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDBInstanceSSLResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDBInstanceSSLResponse setBody(DescribeDBInstanceSSLResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDBInstanceSSLResponseBody getBody() {
        return this.body;
    }

}
