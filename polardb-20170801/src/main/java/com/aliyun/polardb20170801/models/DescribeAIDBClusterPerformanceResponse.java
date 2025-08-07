// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeAIDBClusterPerformanceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeAIDBClusterPerformanceResponseBody body;

    public static DescribeAIDBClusterPerformanceResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeAIDBClusterPerformanceResponse self = new DescribeAIDBClusterPerformanceResponse();
        return TeaModel.build(map, self);
    }

    public DescribeAIDBClusterPerformanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeAIDBClusterPerformanceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeAIDBClusterPerformanceResponse setBody(DescribeAIDBClusterPerformanceResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeAIDBClusterPerformanceResponseBody getBody() {
        return this.body;
    }

}
