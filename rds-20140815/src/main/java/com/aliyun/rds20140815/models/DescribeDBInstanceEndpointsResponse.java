// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeDBInstanceEndpointsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeDBInstanceEndpointsResponseBody body;

    public static DescribeDBInstanceEndpointsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDBInstanceEndpointsResponse self = new DescribeDBInstanceEndpointsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDBInstanceEndpointsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDBInstanceEndpointsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDBInstanceEndpointsResponse setBody(DescribeDBInstanceEndpointsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDBInstanceEndpointsResponseBody getBody() {
        return this.body;
    }

}
