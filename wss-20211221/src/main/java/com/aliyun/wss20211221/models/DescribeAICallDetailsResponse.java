// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.wss20211221.models;

import com.aliyun.tea.*;

public class DescribeAICallDetailsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeAICallDetailsResponseBody body;

    public static DescribeAICallDetailsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeAICallDetailsResponse self = new DescribeAICallDetailsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeAICallDetailsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeAICallDetailsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeAICallDetailsResponse setBody(DescribeAICallDetailsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeAICallDetailsResponseBody getBody() {
        return this.body;
    }

}
