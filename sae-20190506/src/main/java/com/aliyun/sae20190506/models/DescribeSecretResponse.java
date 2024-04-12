// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class DescribeSecretResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeSecretResponseBody body;

    public static DescribeSecretResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeSecretResponse self = new DescribeSecretResponse();
        return TeaModel.build(map, self);
    }

    public DescribeSecretResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeSecretResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeSecretResponse setBody(DescribeSecretResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeSecretResponseBody getBody() {
        return this.body;
    }

}
