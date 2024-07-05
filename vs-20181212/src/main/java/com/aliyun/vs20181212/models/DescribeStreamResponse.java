// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class DescribeStreamResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeStreamResponseBody body;

    public static DescribeStreamResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeStreamResponse self = new DescribeStreamResponse();
        return TeaModel.build(map, self);
    }

    public DescribeStreamResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeStreamResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeStreamResponse setBody(DescribeStreamResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeStreamResponseBody getBody() {
        return this.body;
    }

}
