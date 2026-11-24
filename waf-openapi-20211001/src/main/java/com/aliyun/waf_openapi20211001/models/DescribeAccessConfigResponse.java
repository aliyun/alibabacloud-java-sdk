// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class DescribeAccessConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeAccessConfigResponseBody body;

    public static DescribeAccessConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeAccessConfigResponse self = new DescribeAccessConfigResponse();
        return TeaModel.build(map, self);
    }

    public DescribeAccessConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeAccessConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeAccessConfigResponse setBody(DescribeAccessConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeAccessConfigResponseBody getBody() {
        return this.body;
    }

}
