// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeDBInstancesByPerformanceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeDBInstancesByPerformanceResponseBody body;

    public static DescribeDBInstancesByPerformanceResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDBInstancesByPerformanceResponse self = new DescribeDBInstancesByPerformanceResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDBInstancesByPerformanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDBInstancesByPerformanceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDBInstancesByPerformanceResponse setBody(DescribeDBInstancesByPerformanceResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDBInstancesByPerformanceResponseBody getBody() {
        return this.body;
    }

}
