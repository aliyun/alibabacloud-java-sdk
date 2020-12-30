// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.webplus20190320.models;

import com.aliyun.tea.*;

public class DescribeChangeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeChangeResponseBody body;

    public static DescribeChangeResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeChangeResponse self = new DescribeChangeResponse();
        return TeaModel.build(map, self);
    }

    public DescribeChangeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeChangeResponse setBody(DescribeChangeResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeChangeResponseBody getBody() {
        return this.body;
    }

}
