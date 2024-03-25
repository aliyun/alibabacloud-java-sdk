// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sddp20190103.models;

import com.aliyun.tea.*;

public class DescribeConfigsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeConfigsResponseBody body;

    public static DescribeConfigsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeConfigsResponse self = new DescribeConfigsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeConfigsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeConfigsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeConfigsResponse setBody(DescribeConfigsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeConfigsResponseBody getBody() {
        return this.body;
    }

}
