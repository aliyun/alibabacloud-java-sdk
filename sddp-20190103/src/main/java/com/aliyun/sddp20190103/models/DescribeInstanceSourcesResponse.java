// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sddp20190103.models;

import com.aliyun.tea.*;

public class DescribeInstanceSourcesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeInstanceSourcesResponseBody body;

    public static DescribeInstanceSourcesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstanceSourcesResponse self = new DescribeInstanceSourcesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeInstanceSourcesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeInstanceSourcesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeInstanceSourcesResponse setBody(DescribeInstanceSourcesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeInstanceSourcesResponseBody getBody() {
        return this.body;
    }

}
