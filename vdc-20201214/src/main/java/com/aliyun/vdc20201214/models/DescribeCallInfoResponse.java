// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vdc20201214.models;

import com.aliyun.tea.*;

public class DescribeCallInfoResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeCallInfoResponseBody body;

    public static DescribeCallInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeCallInfoResponse self = new DescribeCallInfoResponse();
        return TeaModel.build(map, self);
    }

    public DescribeCallInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeCallInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeCallInfoResponse setBody(DescribeCallInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeCallInfoResponseBody getBody() {
        return this.body;
    }

}
