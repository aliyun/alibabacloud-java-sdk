// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class DescribeTopicMetricsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeTopicMetricsResponseBody body;

    public static DescribeTopicMetricsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeTopicMetricsResponse self = new DescribeTopicMetricsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeTopicMetricsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeTopicMetricsResponse setBody(DescribeTopicMetricsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeTopicMetricsResponseBody getBody() {
        return this.body;
    }

}
