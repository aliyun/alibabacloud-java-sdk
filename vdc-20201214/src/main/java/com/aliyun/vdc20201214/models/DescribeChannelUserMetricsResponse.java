// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vdc20201214.models;

import com.aliyun.tea.*;

public class DescribeChannelUserMetricsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeChannelUserMetricsResponseBody body;

    public static DescribeChannelUserMetricsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeChannelUserMetricsResponse self = new DescribeChannelUserMetricsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeChannelUserMetricsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeChannelUserMetricsResponse setBody(DescribeChannelUserMetricsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeChannelUserMetricsResponseBody getBody() {
        return this.body;
    }

}
