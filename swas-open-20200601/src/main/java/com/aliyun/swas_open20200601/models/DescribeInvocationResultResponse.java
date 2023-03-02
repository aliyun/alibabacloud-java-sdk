// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.swas_open20200601.models;

import com.aliyun.tea.*;

public class DescribeInvocationResultResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeInvocationResultResponseBody body;

    public static DescribeInvocationResultResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeInvocationResultResponse self = new DescribeInvocationResultResponse();
        return TeaModel.build(map, self);
    }

    public DescribeInvocationResultResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeInvocationResultResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeInvocationResultResponse setBody(DescribeInvocationResultResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeInvocationResultResponseBody getBody() {
        return this.body;
    }

}
