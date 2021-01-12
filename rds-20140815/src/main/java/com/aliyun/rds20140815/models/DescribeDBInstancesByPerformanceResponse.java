// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeDBInstancesByPerformanceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public DescribeDBInstancesByPerformanceResponse setBody(DescribeDBInstancesByPerformanceResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDBInstancesByPerformanceResponseBody getBody() {
        return this.body;
    }

}
