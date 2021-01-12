// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeDBProxyPerformanceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public DescribeDBProxyPerformanceResponse setBody(DescribeDBProxyPerformanceResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDBProxyPerformanceResponseBody getBody() {
        return this.body;
    }

}
