// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DescribePhysicalConnectionsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribePhysicalConnectionsResponseBody body;

    public static DescribePhysicalConnectionsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribePhysicalConnectionsResponse self = new DescribePhysicalConnectionsResponse();
        return TeaModel.build(map, self);
    }

    public DescribePhysicalConnectionsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribePhysicalConnectionsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribePhysicalConnectionsResponse setBody(DescribePhysicalConnectionsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribePhysicalConnectionsResponseBody getBody() {
        return this.body;
    }

}
