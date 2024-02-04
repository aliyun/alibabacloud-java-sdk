// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeDBProxyPerformanceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeDBProxyPerformanceResponseBody body;

    public static DescribeDBProxyPerformanceResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDBProxyPerformanceResponse self = new DescribeDBProxyPerformanceResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDBProxyPerformanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDBProxyPerformanceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDBProxyPerformanceResponse setBody(DescribeDBProxyPerformanceResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDBProxyPerformanceResponseBody getBody() {
        return this.body;
    }

}
