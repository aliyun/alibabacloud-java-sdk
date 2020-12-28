// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.slb20140515.models;

import com.aliyun.tea.*;

public class DescribeHealthStatusResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeHealthStatusResponseBody body;

    public static DescribeHealthStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeHealthStatusResponse self = new DescribeHealthStatusResponse();
        return TeaModel.build(map, self);
    }

    public DescribeHealthStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeHealthStatusResponse setBody(DescribeHealthStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeHealthStatusResponseBody getBody() {
        return this.body;
    }

}
