// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class DescribeStreamResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public DescribeStreamResponse setBody(DescribeStreamResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeStreamResponseBody getBody() {
        return this.body;
    }

}
