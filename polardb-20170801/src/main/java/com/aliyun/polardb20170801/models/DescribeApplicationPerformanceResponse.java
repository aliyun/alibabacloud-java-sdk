// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeApplicationPerformanceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeApplicationPerformanceResponseBody body;

    public static DescribeApplicationPerformanceResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeApplicationPerformanceResponse self = new DescribeApplicationPerformanceResponse();
        return TeaModel.build(map, self);
    }

    public DescribeApplicationPerformanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeApplicationPerformanceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeApplicationPerformanceResponse setBody(DescribeApplicationPerformanceResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeApplicationPerformanceResponseBody getBody() {
        return this.body;
    }

}
