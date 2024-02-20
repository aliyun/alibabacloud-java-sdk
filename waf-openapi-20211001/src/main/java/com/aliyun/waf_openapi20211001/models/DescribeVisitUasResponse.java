// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class DescribeVisitUasResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeVisitUasResponseBody body;

    public static DescribeVisitUasResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeVisitUasResponse self = new DescribeVisitUasResponse();
        return TeaModel.build(map, self);
    }

    public DescribeVisitUasResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeVisitUasResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeVisitUasResponse setBody(DescribeVisitUasResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeVisitUasResponseBody getBody() {
        return this.body;
    }

}
