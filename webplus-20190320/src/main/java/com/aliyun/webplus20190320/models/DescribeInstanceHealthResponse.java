// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.webplus20190320.models;

import com.aliyun.tea.*;

public class DescribeInstanceHealthResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeInstanceHealthResponseBody body;

    public static DescribeInstanceHealthResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstanceHealthResponse self = new DescribeInstanceHealthResponse();
        return TeaModel.build(map, self);
    }

    public DescribeInstanceHealthResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeInstanceHealthResponse setBody(DescribeInstanceHealthResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeInstanceHealthResponseBody getBody() {
        return this.body;
    }

}
