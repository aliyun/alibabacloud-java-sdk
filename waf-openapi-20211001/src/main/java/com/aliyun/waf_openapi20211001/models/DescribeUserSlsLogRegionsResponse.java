// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class DescribeUserSlsLogRegionsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeUserSlsLogRegionsResponseBody body;

    public static DescribeUserSlsLogRegionsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeUserSlsLogRegionsResponse self = new DescribeUserSlsLogRegionsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeUserSlsLogRegionsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeUserSlsLogRegionsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeUserSlsLogRegionsResponse setBody(DescribeUserSlsLogRegionsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeUserSlsLogRegionsResponseBody getBody() {
        return this.body;
    }

}
