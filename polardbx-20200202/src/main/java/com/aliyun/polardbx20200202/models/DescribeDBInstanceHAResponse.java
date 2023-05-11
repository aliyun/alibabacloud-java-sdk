// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class DescribeDBInstanceHAResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeDBInstanceHAResponseBody body;

    public static DescribeDBInstanceHAResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDBInstanceHAResponse self = new DescribeDBInstanceHAResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDBInstanceHAResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDBInstanceHAResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDBInstanceHAResponse setBody(DescribeDBInstanceHAResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDBInstanceHAResponseBody getBody() {
        return this.body;
    }

}
