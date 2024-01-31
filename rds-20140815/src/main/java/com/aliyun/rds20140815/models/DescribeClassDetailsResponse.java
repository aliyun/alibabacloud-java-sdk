// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeClassDetailsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeClassDetailsResponseBody body;

    public static DescribeClassDetailsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeClassDetailsResponse self = new DescribeClassDetailsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeClassDetailsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeClassDetailsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeClassDetailsResponse setBody(DescribeClassDetailsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeClassDetailsResponseBody getBody() {
        return this.body;
    }

}
