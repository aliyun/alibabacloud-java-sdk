// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeDBInstanceMetricsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeDBInstanceMetricsResponseBody body;

    public static DescribeDBInstanceMetricsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDBInstanceMetricsResponse self = new DescribeDBInstanceMetricsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDBInstanceMetricsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDBInstanceMetricsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDBInstanceMetricsResponse setBody(DescribeDBInstanceMetricsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDBInstanceMetricsResponseBody getBody() {
        return this.body;
    }

}
