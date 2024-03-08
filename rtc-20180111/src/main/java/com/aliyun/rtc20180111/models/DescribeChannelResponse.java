// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc20180111.models;

import com.aliyun.tea.*;

public class DescribeChannelResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeChannelResponseBody body;

    public static DescribeChannelResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeChannelResponse self = new DescribeChannelResponse();
        return TeaModel.build(map, self);
    }

    public DescribeChannelResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeChannelResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeChannelResponse setBody(DescribeChannelResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeChannelResponseBody getBody() {
        return this.body;
    }

}
