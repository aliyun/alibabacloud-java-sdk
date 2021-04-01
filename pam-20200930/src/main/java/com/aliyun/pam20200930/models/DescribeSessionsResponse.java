// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pam20200930.models;

import com.aliyun.tea.*;

public class DescribeSessionsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeSessionsResponseBody body;

    public static DescribeSessionsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeSessionsResponse self = new DescribeSessionsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeSessionsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeSessionsResponse setBody(DescribeSessionsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeSessionsResponseBody getBody() {
        return this.body;
    }

}
