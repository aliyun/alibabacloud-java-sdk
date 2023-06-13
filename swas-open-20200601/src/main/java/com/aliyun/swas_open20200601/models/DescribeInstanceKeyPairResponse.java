// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.swas_open20200601.models;

import com.aliyun.tea.*;

public class DescribeInstanceKeyPairResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeInstanceKeyPairResponseBody body;

    public static DescribeInstanceKeyPairResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstanceKeyPairResponse self = new DescribeInstanceKeyPairResponse();
        return TeaModel.build(map, self);
    }

    public DescribeInstanceKeyPairResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeInstanceKeyPairResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeInstanceKeyPairResponse setBody(DescribeInstanceKeyPairResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeInstanceKeyPairResponseBody getBody() {
        return this.body;
    }

}
