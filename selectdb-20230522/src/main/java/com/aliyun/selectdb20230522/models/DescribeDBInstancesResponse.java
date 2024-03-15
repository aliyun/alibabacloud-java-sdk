// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.selectdb20230522.models;

import com.aliyun.tea.*;

public class DescribeDBInstancesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeDBInstancesResponseBody body;

    public static DescribeDBInstancesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDBInstancesResponse self = new DescribeDBInstancesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDBInstancesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDBInstancesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDBInstancesResponse setBody(DescribeDBInstancesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDBInstancesResponseBody getBody() {
        return this.body;
    }

}
