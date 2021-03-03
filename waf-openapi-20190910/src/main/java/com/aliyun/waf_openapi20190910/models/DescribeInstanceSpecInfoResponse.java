// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20190910.models;

import com.aliyun.tea.*;

public class DescribeInstanceSpecInfoResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeInstanceSpecInfoResponseBody body;

    public static DescribeInstanceSpecInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstanceSpecInfoResponse self = new DescribeInstanceSpecInfoResponse();
        return TeaModel.build(map, self);
    }

    public DescribeInstanceSpecInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeInstanceSpecInfoResponse setBody(DescribeInstanceSpecInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeInstanceSpecInfoResponseBody getBody() {
        return this.body;
    }

}
