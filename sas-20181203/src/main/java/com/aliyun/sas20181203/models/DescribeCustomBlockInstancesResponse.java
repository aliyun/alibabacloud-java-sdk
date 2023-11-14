// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeCustomBlockInstancesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeCustomBlockInstancesResponseBody body;

    public static DescribeCustomBlockInstancesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeCustomBlockInstancesResponse self = new DescribeCustomBlockInstancesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeCustomBlockInstancesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeCustomBlockInstancesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeCustomBlockInstancesResponse setBody(DescribeCustomBlockInstancesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeCustomBlockInstancesResponseBody getBody() {
        return this.body;
    }

}
