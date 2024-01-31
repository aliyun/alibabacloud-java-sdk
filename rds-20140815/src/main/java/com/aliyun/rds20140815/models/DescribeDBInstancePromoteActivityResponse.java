// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeDBInstancePromoteActivityResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeDBInstancePromoteActivityResponseBody body;

    public static DescribeDBInstancePromoteActivityResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDBInstancePromoteActivityResponse self = new DescribeDBInstancePromoteActivityResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDBInstancePromoteActivityResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDBInstancePromoteActivityResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDBInstancePromoteActivityResponse setBody(DescribeDBInstancePromoteActivityResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDBInstancePromoteActivityResponseBody getBody() {
        return this.body;
    }

}
