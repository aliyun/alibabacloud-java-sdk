// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeApiLimitResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeApiLimitResponseBody body;

    public static DescribeApiLimitResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeApiLimitResponse self = new DescribeApiLimitResponse();
        return TeaModel.build(map, self);
    }

    public DescribeApiLimitResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeApiLimitResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeApiLimitResponse setBody(DescribeApiLimitResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeApiLimitResponseBody getBody() {
        return this.body;
    }

}
