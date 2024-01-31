// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeImageInstancesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeImageInstancesResponseBody body;

    public static DescribeImageInstancesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeImageInstancesResponse self = new DescribeImageInstancesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeImageInstancesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeImageInstancesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeImageInstancesResponse setBody(DescribeImageInstancesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeImageInstancesResponseBody getBody() {
        return this.body;
    }

}
