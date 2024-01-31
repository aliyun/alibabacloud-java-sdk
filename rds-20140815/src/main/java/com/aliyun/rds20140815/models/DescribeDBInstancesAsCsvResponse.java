// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeDBInstancesAsCsvResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeDBInstancesAsCsvResponseBody body;

    public static DescribeDBInstancesAsCsvResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDBInstancesAsCsvResponse self = new DescribeDBInstancesAsCsvResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDBInstancesAsCsvResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDBInstancesAsCsvResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDBInstancesAsCsvResponse setBody(DescribeDBInstancesAsCsvResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDBInstancesAsCsvResponseBody getBody() {
        return this.body;
    }

}
