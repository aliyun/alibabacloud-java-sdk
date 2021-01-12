// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeDBInstancePerformanceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeDBInstancePerformanceResponseBody body;

    public static DescribeDBInstancePerformanceResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDBInstancePerformanceResponse self = new DescribeDBInstancePerformanceResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDBInstancePerformanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDBInstancePerformanceResponse setBody(DescribeDBInstancePerformanceResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDBInstancePerformanceResponseBody getBody() {
        return this.body;
    }

}
