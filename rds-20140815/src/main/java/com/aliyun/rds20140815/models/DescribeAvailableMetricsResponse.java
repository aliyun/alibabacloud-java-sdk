// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeAvailableMetricsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeAvailableMetricsResponseBody body;

    public static DescribeAvailableMetricsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeAvailableMetricsResponse self = new DescribeAvailableMetricsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeAvailableMetricsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeAvailableMetricsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeAvailableMetricsResponse setBody(DescribeAvailableMetricsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeAvailableMetricsResponseBody getBody() {
        return this.body;
    }

}
