// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribePostgresExtensionsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribePostgresExtensionsResponseBody body;

    public static DescribePostgresExtensionsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribePostgresExtensionsResponse self = new DescribePostgresExtensionsResponse();
        return TeaModel.build(map, self);
    }

    public DescribePostgresExtensionsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribePostgresExtensionsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribePostgresExtensionsResponse setBody(DescribePostgresExtensionsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribePostgresExtensionsResponseBody getBody() {
        return this.body;
    }

}
