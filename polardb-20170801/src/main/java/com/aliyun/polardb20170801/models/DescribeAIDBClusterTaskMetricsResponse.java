// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeAIDBClusterTaskMetricsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeAIDBClusterTaskMetricsResponseBody body;

    public static DescribeAIDBClusterTaskMetricsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeAIDBClusterTaskMetricsResponse self = new DescribeAIDBClusterTaskMetricsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeAIDBClusterTaskMetricsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeAIDBClusterTaskMetricsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeAIDBClusterTaskMetricsResponse setBody(DescribeAIDBClusterTaskMetricsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeAIDBClusterTaskMetricsResponseBody getBody() {
        return this.body;
    }

}
