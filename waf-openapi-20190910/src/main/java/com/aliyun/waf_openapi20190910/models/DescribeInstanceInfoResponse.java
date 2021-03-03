// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20190910.models;

import com.aliyun.tea.*;

public class DescribeInstanceInfoResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeInstanceInfoResponseBody body;

    public static DescribeInstanceInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstanceInfoResponse self = new DescribeInstanceInfoResponse();
        return TeaModel.build(map, self);
    }

    public DescribeInstanceInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeInstanceInfoResponse setBody(DescribeInstanceInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeInstanceInfoResponseBody getBody() {
        return this.body;
    }

}
