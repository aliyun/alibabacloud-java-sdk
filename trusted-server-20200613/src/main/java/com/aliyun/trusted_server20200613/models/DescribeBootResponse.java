// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trusted_server20200613.models;

import com.aliyun.tea.*;

public class DescribeBootResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeBootResponseBody body;

    public static DescribeBootResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeBootResponse self = new DescribeBootResponse();
        return TeaModel.build(map, self);
    }

    public DescribeBootResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeBootResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeBootResponse setBody(DescribeBootResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeBootResponseBody getBody() {
        return this.body;
    }

}
