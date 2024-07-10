// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class DescribeWebApplicationRevisionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public WebApplicationRevisionBody body;

    public static DescribeWebApplicationRevisionResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeWebApplicationRevisionResponse self = new DescribeWebApplicationRevisionResponse();
        return TeaModel.build(map, self);
    }

    public DescribeWebApplicationRevisionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeWebApplicationRevisionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeWebApplicationRevisionResponse setBody(WebApplicationRevisionBody body) {
        this.body = body;
        return this;
    }
    public WebApplicationRevisionBody getBody() {
        return this.body;
    }

}
