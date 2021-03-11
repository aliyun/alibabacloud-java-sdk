// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class DescribeStreamURLResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeStreamURLResponseBody body;

    public static DescribeStreamURLResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeStreamURLResponse self = new DescribeStreamURLResponse();
        return TeaModel.build(map, self);
    }

    public DescribeStreamURLResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeStreamURLResponse setBody(DescribeStreamURLResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeStreamURLResponseBody getBody() {
        return this.body;
    }

}
