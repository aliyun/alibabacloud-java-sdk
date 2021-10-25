// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeDBInstanceMetricsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public DescribeDBInstanceMetricsResponse setBody(DescribeDBInstanceMetricsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDBInstanceMetricsResponseBody getBody() {
        return this.body;
    }

}
