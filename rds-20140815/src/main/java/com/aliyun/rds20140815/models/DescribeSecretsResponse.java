// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeSecretsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeSecretsResponseBody body;

    public static DescribeSecretsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeSecretsResponse self = new DescribeSecretsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeSecretsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeSecretsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeSecretsResponse setBody(DescribeSecretsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeSecretsResponseBody getBody() {
        return this.body;
    }

}
