// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeDBInitializeVariableResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeDBInitializeVariableResponseBody body;

    public static DescribeDBInitializeVariableResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDBInitializeVariableResponse self = new DescribeDBInitializeVariableResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDBInitializeVariableResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDBInitializeVariableResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDBInitializeVariableResponse setBody(DescribeDBInitializeVariableResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDBInitializeVariableResponseBody getBody() {
        return this.body;
    }

}
