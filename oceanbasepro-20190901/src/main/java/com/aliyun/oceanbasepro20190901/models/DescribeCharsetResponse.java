// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class DescribeCharsetResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeCharsetResponseBody body;

    public static DescribeCharsetResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeCharsetResponse self = new DescribeCharsetResponse();
        return TeaModel.build(map, self);
    }

    public DescribeCharsetResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeCharsetResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeCharsetResponse setBody(DescribeCharsetResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeCharsetResponseBody getBody() {
        return this.body;
    }

}
