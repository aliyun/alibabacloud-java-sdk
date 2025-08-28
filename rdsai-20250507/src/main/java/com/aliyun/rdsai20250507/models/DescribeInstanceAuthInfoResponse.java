// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rdsai20250507.models;

import com.aliyun.tea.*;

public class DescribeInstanceAuthInfoResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeInstanceAuthInfoResponseBody body;

    public static DescribeInstanceAuthInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstanceAuthInfoResponse self = new DescribeInstanceAuthInfoResponse();
        return TeaModel.build(map, self);
    }

    public DescribeInstanceAuthInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeInstanceAuthInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeInstanceAuthInfoResponse setBody(DescribeInstanceAuthInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeInstanceAuthInfoResponseBody getBody() {
        return this.body;
    }

}
