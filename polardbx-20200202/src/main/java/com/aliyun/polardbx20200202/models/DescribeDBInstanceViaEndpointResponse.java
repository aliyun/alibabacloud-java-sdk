// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class DescribeDBInstanceViaEndpointResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeDBInstanceViaEndpointResponseBody body;

    public static DescribeDBInstanceViaEndpointResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDBInstanceViaEndpointResponse self = new DescribeDBInstanceViaEndpointResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDBInstanceViaEndpointResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDBInstanceViaEndpointResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDBInstanceViaEndpointResponse setBody(DescribeDBInstanceViaEndpointResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDBInstanceViaEndpointResponseBody getBody() {
        return this.body;
    }

}
