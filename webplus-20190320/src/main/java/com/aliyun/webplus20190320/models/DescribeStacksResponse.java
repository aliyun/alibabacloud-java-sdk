// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.webplus20190320.models;

import com.aliyun.tea.*;

public class DescribeStacksResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeStacksResponseBody body;

    public static DescribeStacksResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeStacksResponse self = new DescribeStacksResponse();
        return TeaModel.build(map, self);
    }

    public DescribeStacksResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeStacksResponse setBody(DescribeStacksResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeStacksResponseBody getBody() {
        return this.body;
    }

}
