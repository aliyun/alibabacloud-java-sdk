// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeRequestHitResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeRequestHitResponseBody body;

    public static DescribeRequestHitResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeRequestHitResponse self = new DescribeRequestHitResponse();
        return TeaModel.build(map, self);
    }

    public DescribeRequestHitResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeRequestHitResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeRequestHitResponse setBody(DescribeRequestHitResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeRequestHitResponseBody getBody() {
        return this.body;
    }

}
