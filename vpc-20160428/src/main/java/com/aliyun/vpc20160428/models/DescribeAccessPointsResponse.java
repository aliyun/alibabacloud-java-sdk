// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DescribeAccessPointsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeAccessPointsResponseBody body;

    public static DescribeAccessPointsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeAccessPointsResponse self = new DescribeAccessPointsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeAccessPointsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeAccessPointsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeAccessPointsResponse setBody(DescribeAccessPointsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeAccessPointsResponseBody getBody() {
        return this.body;
    }

}
