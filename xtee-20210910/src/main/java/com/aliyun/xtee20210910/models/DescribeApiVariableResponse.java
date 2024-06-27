// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeApiVariableResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeApiVariableResponseBody body;

    public static DescribeApiVariableResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeApiVariableResponse self = new DescribeApiVariableResponse();
        return TeaModel.build(map, self);
    }

    public DescribeApiVariableResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeApiVariableResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeApiVariableResponse setBody(DescribeApiVariableResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeApiVariableResponseBody getBody() {
        return this.body;
    }

}
