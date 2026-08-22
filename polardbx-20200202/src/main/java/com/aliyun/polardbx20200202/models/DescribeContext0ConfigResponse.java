// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class DescribeContext0ConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeContext0ConfigResponseBody body;

    public static DescribeContext0ConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeContext0ConfigResponse self = new DescribeContext0ConfigResponse();
        return TeaModel.build(map, self);
    }

    public DescribeContext0ConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeContext0ConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeContext0ConfigResponse setBody(DescribeContext0ConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeContext0ConfigResponseBody getBody() {
        return this.body;
    }

}
