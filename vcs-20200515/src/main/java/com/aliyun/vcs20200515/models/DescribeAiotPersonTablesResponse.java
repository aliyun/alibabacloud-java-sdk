// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class DescribeAiotPersonTablesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeAiotPersonTablesResponseBody body;

    public static DescribeAiotPersonTablesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeAiotPersonTablesResponse self = new DescribeAiotPersonTablesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeAiotPersonTablesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeAiotPersonTablesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeAiotPersonTablesResponse setBody(DescribeAiotPersonTablesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeAiotPersonTablesResponseBody getBody() {
        return this.body;
    }

}
