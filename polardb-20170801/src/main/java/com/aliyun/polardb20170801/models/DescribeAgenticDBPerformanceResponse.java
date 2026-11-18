// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeAgenticDBPerformanceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeAgenticDBPerformanceResponseBody body;

    public static DescribeAgenticDBPerformanceResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeAgenticDBPerformanceResponse self = new DescribeAgenticDBPerformanceResponse();
        return TeaModel.build(map, self);
    }

    public DescribeAgenticDBPerformanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeAgenticDBPerformanceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeAgenticDBPerformanceResponse setBody(DescribeAgenticDBPerformanceResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeAgenticDBPerformanceResponseBody getBody() {
        return this.body;
    }

}
