// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class DescribeInstanceMetricsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeInstanceMetricsResponseBody body;

    public static DescribeInstanceMetricsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstanceMetricsResponse self = new DescribeInstanceMetricsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeInstanceMetricsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeInstanceMetricsResponse setBody(DescribeInstanceMetricsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeInstanceMetricsResponseBody getBody() {
        return this.body;
    }

}
