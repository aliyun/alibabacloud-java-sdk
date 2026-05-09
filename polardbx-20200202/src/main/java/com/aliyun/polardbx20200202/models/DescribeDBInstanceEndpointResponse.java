// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class DescribeDBInstanceEndpointResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeDBInstanceEndpointResponseBody body;

    public static DescribeDBInstanceEndpointResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDBInstanceEndpointResponse self = new DescribeDBInstanceEndpointResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDBInstanceEndpointResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDBInstanceEndpointResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDBInstanceEndpointResponse setBody(DescribeDBInstanceEndpointResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDBInstanceEndpointResponseBody getBody() {
        return this.body;
    }

}
