// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeAuthStatusResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeAuthStatusResponseBody body;

    public static DescribeAuthStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeAuthStatusResponse self = new DescribeAuthStatusResponse();
        return TeaModel.build(map, self);
    }

    public DescribeAuthStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeAuthStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeAuthStatusResponse setBody(DescribeAuthStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeAuthStatusResponseBody getBody() {
        return this.body;
    }

}
