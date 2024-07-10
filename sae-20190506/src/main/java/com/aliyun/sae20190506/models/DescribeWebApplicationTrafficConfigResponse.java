// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class DescribeWebApplicationTrafficConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public WebApplicationTrafficConfigBody body;

    public static DescribeWebApplicationTrafficConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeWebApplicationTrafficConfigResponse self = new DescribeWebApplicationTrafficConfigResponse();
        return TeaModel.build(map, self);
    }

    public DescribeWebApplicationTrafficConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeWebApplicationTrafficConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeWebApplicationTrafficConfigResponse setBody(WebApplicationTrafficConfigBody body) {
        this.body = body;
        return this;
    }
    public WebApplicationTrafficConfigBody getBody() {
        return this.body;
    }

}
