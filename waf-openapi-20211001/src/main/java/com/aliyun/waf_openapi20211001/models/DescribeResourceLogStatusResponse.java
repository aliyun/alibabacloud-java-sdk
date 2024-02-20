// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class DescribeResourceLogStatusResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeResourceLogStatusResponseBody body;

    public static DescribeResourceLogStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeResourceLogStatusResponse self = new DescribeResourceLogStatusResponse();
        return TeaModel.build(map, self);
    }

    public DescribeResourceLogStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeResourceLogStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeResourceLogStatusResponse setBody(DescribeResourceLogStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeResourceLogStatusResponseBody getBody() {
        return this.body;
    }

}
