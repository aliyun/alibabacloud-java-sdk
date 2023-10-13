// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.selectdb20230522.models;

import com.aliyun.tea.*;

public class DescribeDBInstanceNetInfoResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeDBInstanceNetInfoResponseBody body;

    public static DescribeDBInstanceNetInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDBInstanceNetInfoResponse self = new DescribeDBInstanceNetInfoResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDBInstanceNetInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDBInstanceNetInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDBInstanceNetInfoResponse setBody(DescribeDBInstanceNetInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDBInstanceNetInfoResponseBody getBody() {
        return this.body;
    }

}
