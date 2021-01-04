// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class DescribeHealthCheckAttributeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeHealthCheckAttributeResponseBody body;

    public static DescribeHealthCheckAttributeResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeHealthCheckAttributeResponse self = new DescribeHealthCheckAttributeResponse();
        return TeaModel.build(map, self);
    }

    public DescribeHealthCheckAttributeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeHealthCheckAttributeResponse setBody(DescribeHealthCheckAttributeResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeHealthCheckAttributeResponseBody getBody() {
        return this.body;
    }

}
