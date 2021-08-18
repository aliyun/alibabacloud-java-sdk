// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vdc20201214.models;

import com.aliyun.tea.*;

public class DescribeRtcChannelMetricListResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeRtcChannelMetricListResponseBody body;

    public static DescribeRtcChannelMetricListResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeRtcChannelMetricListResponse self = new DescribeRtcChannelMetricListResponse();
        return TeaModel.build(map, self);
    }

    public DescribeRtcChannelMetricListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeRtcChannelMetricListResponse setBody(DescribeRtcChannelMetricListResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeRtcChannelMetricListResponseBody getBody() {
        return this.body;
    }

}
