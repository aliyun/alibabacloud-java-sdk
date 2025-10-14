// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class DescribeTransformStatusResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeTransformStatusResponseBody body;

    public static DescribeTransformStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeTransformStatusResponse self = new DescribeTransformStatusResponse();
        return TeaModel.build(map, self);
    }

    public DescribeTransformStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeTransformStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeTransformStatusResponse setBody(DescribeTransformStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeTransformStatusResponseBody getBody() {
        return this.body;
    }

}
