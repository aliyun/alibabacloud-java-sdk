// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class DescribeNodeMetricsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeNodeMetricsResponseBody body;

    public static DescribeNodeMetricsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeNodeMetricsResponse self = new DescribeNodeMetricsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeNodeMetricsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeNodeMetricsResponse setBody(DescribeNodeMetricsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeNodeMetricsResponseBody getBody() {
        return this.body;
    }

}
