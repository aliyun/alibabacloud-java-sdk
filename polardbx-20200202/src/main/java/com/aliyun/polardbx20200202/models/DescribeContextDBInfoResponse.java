// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class DescribeContextDBInfoResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeContextDBInfoResponseBody body;

    public static DescribeContextDBInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeContextDBInfoResponse self = new DescribeContextDBInfoResponse();
        return TeaModel.build(map, self);
    }

    public DescribeContextDBInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeContextDBInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeContextDBInfoResponse setBody(DescribeContextDBInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeContextDBInfoResponseBody getBody() {
        return this.body;
    }

}
