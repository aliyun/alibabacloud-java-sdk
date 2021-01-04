// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class DescribeHealthChecksResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeHealthChecksResponseBody body;

    public static DescribeHealthChecksResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeHealthChecksResponse self = new DescribeHealthChecksResponse();
        return TeaModel.build(map, self);
    }

    public DescribeHealthChecksResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeHealthChecksResponse setBody(DescribeHealthChecksResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeHealthChecksResponseBody getBody() {
        return this.body;
    }

}
