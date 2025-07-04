// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeRCInvocationResultsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeRCInvocationResultsResponseBody body;

    public static DescribeRCInvocationResultsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeRCInvocationResultsResponse self = new DescribeRCInvocationResultsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeRCInvocationResultsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeRCInvocationResultsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeRCInvocationResultsResponse setBody(DescribeRCInvocationResultsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeRCInvocationResultsResponseBody getBody() {
        return this.body;
    }

}
