// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class DescribeDefaultHttpsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeDefaultHttpsResponseBody body;

    public static DescribeDefaultHttpsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDefaultHttpsResponse self = new DescribeDefaultHttpsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDefaultHttpsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDefaultHttpsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDefaultHttpsResponse setBody(DescribeDefaultHttpsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDefaultHttpsResponseBody getBody() {
        return this.body;
    }

}
