// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeDBProxyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeDBProxyResponseBody body;

    public static DescribeDBProxyResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDBProxyResponse self = new DescribeDBProxyResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDBProxyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDBProxyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDBProxyResponse setBody(DescribeDBProxyResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDBProxyResponseBody getBody() {
        return this.body;
    }

}
