// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class DescribeContextDBConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeContextDBConfigResponseBody body;

    public static DescribeContextDBConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeContextDBConfigResponse self = new DescribeContextDBConfigResponse();
        return TeaModel.build(map, self);
    }

    public DescribeContextDBConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeContextDBConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeContextDBConfigResponse setBody(DescribeContextDBConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeContextDBConfigResponseBody getBody() {
        return this.body;
    }

}
