// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class DescribeApplicationImageResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeApplicationImageResponseBody body;

    public static DescribeApplicationImageResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeApplicationImageResponse self = new DescribeApplicationImageResponse();
        return TeaModel.build(map, self);
    }

    public DescribeApplicationImageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeApplicationImageResponse setBody(DescribeApplicationImageResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeApplicationImageResponseBody getBody() {
        return this.body;
    }

}
