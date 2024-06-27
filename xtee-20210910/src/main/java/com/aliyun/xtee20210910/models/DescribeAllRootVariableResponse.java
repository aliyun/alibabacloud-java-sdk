// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeAllRootVariableResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeAllRootVariableResponseBody body;

    public static DescribeAllRootVariableResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeAllRootVariableResponse self = new DescribeAllRootVariableResponse();
        return TeaModel.build(map, self);
    }

    public DescribeAllRootVariableResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeAllRootVariableResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeAllRootVariableResponse setBody(DescribeAllRootVariableResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeAllRootVariableResponseBody getBody() {
        return this.body;
    }

}
