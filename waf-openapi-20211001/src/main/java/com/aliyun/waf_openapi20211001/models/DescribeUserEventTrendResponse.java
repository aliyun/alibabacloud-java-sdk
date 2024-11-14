// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class DescribeUserEventTrendResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeUserEventTrendResponseBody body;

    public static DescribeUserEventTrendResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeUserEventTrendResponse self = new DescribeUserEventTrendResponse();
        return TeaModel.build(map, self);
    }

    public DescribeUserEventTrendResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeUserEventTrendResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeUserEventTrendResponse setBody(DescribeUserEventTrendResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeUserEventTrendResponseBody getBody() {
        return this.body;
    }

}
