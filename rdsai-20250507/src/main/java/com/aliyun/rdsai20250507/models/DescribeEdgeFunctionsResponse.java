// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rdsai20250507.models;

import com.aliyun.tea.*;

public class DescribeEdgeFunctionsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeEdgeFunctionsResponseBody body;

    public static DescribeEdgeFunctionsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeEdgeFunctionsResponse self = new DescribeEdgeFunctionsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeEdgeFunctionsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeEdgeFunctionsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeEdgeFunctionsResponse setBody(DescribeEdgeFunctionsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeEdgeFunctionsResponseBody getBody() {
        return this.body;
    }

}
