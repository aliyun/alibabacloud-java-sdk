// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeAvailableMetricsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public DescribeAvailableMetricsResponse setBody(DescribeAvailableMetricsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeAvailableMetricsResponseBody getBody() {
        return this.body;
    }

}
