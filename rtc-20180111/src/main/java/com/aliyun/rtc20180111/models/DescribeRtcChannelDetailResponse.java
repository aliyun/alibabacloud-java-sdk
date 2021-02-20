// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc20180111.models;

import com.aliyun.tea.*;

public class DescribeRtcChannelDetailResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeRtcChannelDetailResponseBody body;

    public static DescribeRtcChannelDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeRtcChannelDetailResponse self = new DescribeRtcChannelDetailResponse();
        return TeaModel.build(map, self);
    }

    public DescribeRtcChannelDetailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeRtcChannelDetailResponse setBody(DescribeRtcChannelDetailResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeRtcChannelDetailResponseBody getBody() {
        return this.body;
    }

}
