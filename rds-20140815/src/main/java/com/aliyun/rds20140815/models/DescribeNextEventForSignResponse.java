// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeNextEventForSignResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeNextEventForSignResponseBody body;

    public static DescribeNextEventForSignResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeNextEventForSignResponse self = new DescribeNextEventForSignResponse();
        return TeaModel.build(map, self);
    }

    public DescribeNextEventForSignResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeNextEventForSignResponse setBody(DescribeNextEventForSignResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeNextEventForSignResponseBody getBody() {
        return this.body;
    }

}
