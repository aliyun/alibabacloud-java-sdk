// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class DescribeChangeOrderResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeChangeOrderResponseBody body;

    public static DescribeChangeOrderResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeChangeOrderResponse self = new DescribeChangeOrderResponse();
        return TeaModel.build(map, self);
    }

    public DescribeChangeOrderResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeChangeOrderResponse setBody(DescribeChangeOrderResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeChangeOrderResponseBody getBody() {
        return this.body;
    }

}
