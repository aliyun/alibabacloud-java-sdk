// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class DescribeApiExportsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeApiExportsResponseBody body;

    public static DescribeApiExportsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeApiExportsResponse self = new DescribeApiExportsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeApiExportsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeApiExportsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeApiExportsResponse setBody(DescribeApiExportsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeApiExportsResponseBody getBody() {
        return this.body;
    }

}
