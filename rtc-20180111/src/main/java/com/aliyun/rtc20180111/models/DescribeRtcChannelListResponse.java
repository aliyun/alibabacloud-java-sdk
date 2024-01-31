// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc20180111.models;

import com.aliyun.tea.*;

public class DescribeRtcChannelListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeRtcChannelListResponseBody body;

    public static DescribeRtcChannelListResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeRtcChannelListResponse self = new DescribeRtcChannelListResponse();
        return TeaModel.build(map, self);
    }

    public DescribeRtcChannelListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeRtcChannelListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeRtcChannelListResponse setBody(DescribeRtcChannelListResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeRtcChannelListResponseBody getBody() {
        return this.body;
    }

}
