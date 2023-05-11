// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class DescribeDBNodePerformanceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeDBNodePerformanceResponseBody body;

    public static DescribeDBNodePerformanceResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDBNodePerformanceResponse self = new DescribeDBNodePerformanceResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDBNodePerformanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDBNodePerformanceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDBNodePerformanceResponse setBody(DescribeDBNodePerformanceResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDBNodePerformanceResponseBody getBody() {
        return this.body;
    }

}
