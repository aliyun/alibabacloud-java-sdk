// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeResourceDetailsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeResourceDetailsResponseBody body;

    public static DescribeResourceDetailsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeResourceDetailsResponse self = new DescribeResourceDetailsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeResourceDetailsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeResourceDetailsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeResourceDetailsResponse setBody(DescribeResourceDetailsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeResourceDetailsResponseBody getBody() {
        return this.body;
    }

}
