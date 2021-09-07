// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class DescribeInstanceStoragePerformanceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeInstanceStoragePerformanceResponseBody body;

    public static DescribeInstanceStoragePerformanceResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstanceStoragePerformanceResponse self = new DescribeInstanceStoragePerformanceResponse();
        return TeaModel.build(map, self);
    }

    public DescribeInstanceStoragePerformanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeInstanceStoragePerformanceResponse setBody(DescribeInstanceStoragePerformanceResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeInstanceStoragePerformanceResponseBody getBody() {
        return this.body;
    }

}
