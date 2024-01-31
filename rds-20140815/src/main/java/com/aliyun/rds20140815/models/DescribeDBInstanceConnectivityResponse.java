// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeDBInstanceConnectivityResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeDBInstanceConnectivityResponseBody body;

    public static DescribeDBInstanceConnectivityResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDBInstanceConnectivityResponse self = new DescribeDBInstanceConnectivityResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDBInstanceConnectivityResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDBInstanceConnectivityResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDBInstanceConnectivityResponse setBody(DescribeDBInstanceConnectivityResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDBInstanceConnectivityResponseBody getBody() {
        return this.body;
    }

}
