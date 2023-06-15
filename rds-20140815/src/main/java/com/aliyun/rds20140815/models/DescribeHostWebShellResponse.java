// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeHostWebShellResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeHostWebShellResponseBody body;

    public static DescribeHostWebShellResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeHostWebShellResponse self = new DescribeHostWebShellResponse();
        return TeaModel.build(map, self);
    }

    public DescribeHostWebShellResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeHostWebShellResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeHostWebShellResponse setBody(DescribeHostWebShellResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeHostWebShellResponseBody getBody() {
        return this.body;
    }

}
