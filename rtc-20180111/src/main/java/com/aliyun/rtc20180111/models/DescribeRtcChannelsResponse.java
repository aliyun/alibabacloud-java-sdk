// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc20180111.models;

import com.aliyun.tea.*;

public class DescribeRtcChannelsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeRtcChannelsResponseBody body;

    public static DescribeRtcChannelsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeRtcChannelsResponse self = new DescribeRtcChannelsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeRtcChannelsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeRtcChannelsResponse setBody(DescribeRtcChannelsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeRtcChannelsResponseBody getBody() {
        return this.body;
    }

}
