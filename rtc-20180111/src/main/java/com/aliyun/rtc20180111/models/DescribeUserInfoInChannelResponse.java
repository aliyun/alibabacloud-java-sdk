// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc20180111.models;

import com.aliyun.tea.*;

public class DescribeUserInfoInChannelResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeUserInfoInChannelResponseBody body;

    public static DescribeUserInfoInChannelResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeUserInfoInChannelResponse self = new DescribeUserInfoInChannelResponse();
        return TeaModel.build(map, self);
    }

    public DescribeUserInfoInChannelResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeUserInfoInChannelResponse setBody(DescribeUserInfoInChannelResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeUserInfoInChannelResponseBody getBody() {
        return this.body;
    }

}
