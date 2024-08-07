// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class DescribeWebApplicationScalingConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public WebApplicationScalingConfigBody body;

    public static DescribeWebApplicationScalingConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeWebApplicationScalingConfigResponse self = new DescribeWebApplicationScalingConfigResponse();
        return TeaModel.build(map, self);
    }

    public DescribeWebApplicationScalingConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeWebApplicationScalingConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeWebApplicationScalingConfigResponse setBody(WebApplicationScalingConfigBody body) {
        this.body = body;
        return this;
    }
    public WebApplicationScalingConfigBody getBody() {
        return this.body;
    }

}
