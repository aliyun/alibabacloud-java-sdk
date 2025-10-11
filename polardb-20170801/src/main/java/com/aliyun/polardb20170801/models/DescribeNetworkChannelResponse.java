// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeNetworkChannelResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeNetworkChannelResponseBody body;

    public static DescribeNetworkChannelResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeNetworkChannelResponse self = new DescribeNetworkChannelResponse();
        return TeaModel.build(map, self);
    }

    public DescribeNetworkChannelResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeNetworkChannelResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeNetworkChannelResponse setBody(DescribeNetworkChannelResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeNetworkChannelResponseBody getBody() {
        return this.body;
    }

}
