// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc20180111.models;

import com.aliyun.tea.*;

public class DescribeChannelUserResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeChannelUserResponseBody body;

    public static DescribeChannelUserResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeChannelUserResponse self = new DescribeChannelUserResponse();
        return TeaModel.build(map, self);
    }

    public DescribeChannelUserResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeChannelUserResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeChannelUserResponse setBody(DescribeChannelUserResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeChannelUserResponseBody getBody() {
        return this.body;
    }

}
