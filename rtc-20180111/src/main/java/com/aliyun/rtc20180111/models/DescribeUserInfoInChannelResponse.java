// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc20180111.models;

import com.aliyun.tea.*;

public class DescribeUserInfoInChannelResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public DescribeUserInfoInChannelResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeUserInfoInChannelResponse setBody(DescribeUserInfoInChannelResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeUserInfoInChannelResponseBody getBody() {
        return this.body;
    }

}
