// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeApplicationComponentPerformanceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeApplicationComponentPerformanceResponseBody body;

    public static DescribeApplicationComponentPerformanceResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeApplicationComponentPerformanceResponse self = new DescribeApplicationComponentPerformanceResponse();
        return TeaModel.build(map, self);
    }

    public DescribeApplicationComponentPerformanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeApplicationComponentPerformanceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeApplicationComponentPerformanceResponse setBody(DescribeApplicationComponentPerformanceResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeApplicationComponentPerformanceResponseBody getBody() {
        return this.body;
    }

}
