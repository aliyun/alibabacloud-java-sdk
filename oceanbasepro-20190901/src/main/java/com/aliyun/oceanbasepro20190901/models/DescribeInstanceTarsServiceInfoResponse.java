// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class DescribeInstanceTarsServiceInfoResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeInstanceTarsServiceInfoResponseBody body;

    public static DescribeInstanceTarsServiceInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstanceTarsServiceInfoResponse self = new DescribeInstanceTarsServiceInfoResponse();
        return TeaModel.build(map, self);
    }

    public DescribeInstanceTarsServiceInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeInstanceTarsServiceInfoResponse setBody(DescribeInstanceTarsServiceInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeInstanceTarsServiceInfoResponseBody getBody() {
        return this.body;
    }

}
