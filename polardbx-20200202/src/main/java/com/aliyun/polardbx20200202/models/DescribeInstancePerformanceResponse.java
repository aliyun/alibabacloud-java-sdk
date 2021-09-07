// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class DescribeInstancePerformanceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeInstancePerformanceResponseBody body;

    public static DescribeInstancePerformanceResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstancePerformanceResponse self = new DescribeInstancePerformanceResponse();
        return TeaModel.build(map, self);
    }

    public DescribeInstancePerformanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeInstancePerformanceResponse setBody(DescribeInstancePerformanceResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeInstancePerformanceResponseBody getBody() {
        return this.body;
    }

}
