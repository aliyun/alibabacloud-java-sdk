// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class DescribeComfyProductionsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeComfyProductionsResponseBody body;

    public static DescribeComfyProductionsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeComfyProductionsResponse self = new DescribeComfyProductionsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeComfyProductionsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeComfyProductionsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeComfyProductionsResponse setBody(DescribeComfyProductionsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeComfyProductionsResponseBody getBody() {
        return this.body;
    }

}
