// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class DescribeRenderingInstanceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeRenderingInstanceResponseBody body;

    public static DescribeRenderingInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeRenderingInstanceResponse self = new DescribeRenderingInstanceResponse();
        return TeaModel.build(map, self);
    }

    public DescribeRenderingInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeRenderingInstanceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeRenderingInstanceResponse setBody(DescribeRenderingInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeRenderingInstanceResponseBody getBody() {
        return this.body;
    }

}
