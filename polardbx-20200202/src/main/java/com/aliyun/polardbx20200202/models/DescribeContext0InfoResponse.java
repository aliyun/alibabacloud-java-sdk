// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class DescribeContext0InfoResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeContext0InfoResponseBody body;

    public static DescribeContext0InfoResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeContext0InfoResponse self = new DescribeContext0InfoResponse();
        return TeaModel.build(map, self);
    }

    public DescribeContext0InfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeContext0InfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeContext0InfoResponse setBody(DescribeContext0InfoResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeContext0InfoResponseBody getBody() {
        return this.body;
    }

}
