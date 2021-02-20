// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc20180111.models;

import com.aliyun.tea.*;

public class DescribeRtcChannelMetricsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeRtcChannelMetricsResponseBody body;

    public static DescribeRtcChannelMetricsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeRtcChannelMetricsResponse self = new DescribeRtcChannelMetricsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeRtcChannelMetricsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeRtcChannelMetricsResponse setBody(DescribeRtcChannelMetricsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeRtcChannelMetricsResponseBody getBody() {
        return this.body;
    }

}
