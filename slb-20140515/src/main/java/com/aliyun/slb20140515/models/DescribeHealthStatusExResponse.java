// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.slb20140515.models;

import com.aliyun.tea.*;

public class DescribeHealthStatusExResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeHealthStatusExResponseBody body;

    public static DescribeHealthStatusExResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeHealthStatusExResponse self = new DescribeHealthStatusExResponse();
        return TeaModel.build(map, self);
    }

    public DescribeHealthStatusExResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeHealthStatusExResponse setBody(DescribeHealthStatusExResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeHealthStatusExResponseBody getBody() {
        return this.body;
    }

}
