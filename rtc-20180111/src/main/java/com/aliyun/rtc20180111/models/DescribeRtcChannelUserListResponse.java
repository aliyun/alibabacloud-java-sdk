// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc20180111.models;

import com.aliyun.tea.*;

public class DescribeRtcChannelUserListResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeRtcChannelUserListResponseBody body;

    public static DescribeRtcChannelUserListResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeRtcChannelUserListResponse self = new DescribeRtcChannelUserListResponse();
        return TeaModel.build(map, self);
    }

    public DescribeRtcChannelUserListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeRtcChannelUserListResponse setBody(DescribeRtcChannelUserListResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeRtcChannelUserListResponseBody getBody() {
        return this.body;
    }

}
