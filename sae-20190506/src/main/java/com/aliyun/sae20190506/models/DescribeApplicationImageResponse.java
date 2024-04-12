// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class DescribeApplicationImageResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeApplicationImageResponseBody body;

    public static DescribeApplicationImageResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeApplicationImageResponse self = new DescribeApplicationImageResponse();
        return TeaModel.build(map, self);
    }

    public DescribeApplicationImageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeApplicationImageResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeApplicationImageResponse setBody(DescribeApplicationImageResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeApplicationImageResponseBody getBody() {
        return this.body;
    }

}
