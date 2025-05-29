// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class DescribeRenderingSessionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeRenderingSessionResponseBody body;

    public static DescribeRenderingSessionResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeRenderingSessionResponse self = new DescribeRenderingSessionResponse();
        return TeaModel.build(map, self);
    }

    public DescribeRenderingSessionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeRenderingSessionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeRenderingSessionResponse setBody(DescribeRenderingSessionResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeRenderingSessionResponseBody getBody() {
        return this.body;
    }

}
