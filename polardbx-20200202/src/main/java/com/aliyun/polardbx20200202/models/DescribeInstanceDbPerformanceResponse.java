// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class DescribeInstanceDbPerformanceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeInstanceDbPerformanceResponseBody body;

    public static DescribeInstanceDbPerformanceResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstanceDbPerformanceResponse self = new DescribeInstanceDbPerformanceResponse();
        return TeaModel.build(map, self);
    }

    public DescribeInstanceDbPerformanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeInstanceDbPerformanceResponse setBody(DescribeInstanceDbPerformanceResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeInstanceDbPerformanceResponseBody getBody() {
        return this.body;
    }

}
