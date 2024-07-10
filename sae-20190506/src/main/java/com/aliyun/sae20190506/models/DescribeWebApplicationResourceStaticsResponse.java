// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class DescribeWebApplicationResourceStaticsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public WebApplicationResourceStaticsBody body;

    public static DescribeWebApplicationResourceStaticsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeWebApplicationResourceStaticsResponse self = new DescribeWebApplicationResourceStaticsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeWebApplicationResourceStaticsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeWebApplicationResourceStaticsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeWebApplicationResourceStaticsResponse setBody(WebApplicationResourceStaticsBody body) {
        this.body = body;
        return this;
    }
    public WebApplicationResourceStaticsBody getBody() {
        return this.body;
    }

}
