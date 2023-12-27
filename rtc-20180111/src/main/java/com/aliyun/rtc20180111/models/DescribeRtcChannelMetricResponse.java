// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc20180111.models;

import com.aliyun.tea.*;

public class DescribeRtcChannelMetricResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeRtcChannelMetricResponseBody body;

    public static DescribeRtcChannelMetricResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeRtcChannelMetricResponse self = new DescribeRtcChannelMetricResponse();
        return TeaModel.build(map, self);
    }

    public DescribeRtcChannelMetricResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeRtcChannelMetricResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeRtcChannelMetricResponse setBody(DescribeRtcChannelMetricResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeRtcChannelMetricResponseBody getBody() {
        return this.body;
    }

}
