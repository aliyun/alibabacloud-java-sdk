// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc20180111.models;

import com.aliyun.tea.*;

public class DescribeRtcChannelListResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public DescribeRtcChannelListResponse setBody(DescribeRtcChannelListResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeRtcChannelListResponseBody getBody() {
        return this.body;
    }

}
