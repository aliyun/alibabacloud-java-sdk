// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class DescribeBacklogMetricsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeBacklogMetricsResponseBody body;

    public static DescribeBacklogMetricsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeBacklogMetricsResponse self = new DescribeBacklogMetricsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeBacklogMetricsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeBacklogMetricsResponse setBody(DescribeBacklogMetricsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeBacklogMetricsResponseBody getBody() {
        return this.body;
    }

}
