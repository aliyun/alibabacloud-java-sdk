// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeActivationCodeDetailsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeActivationCodeDetailsResponseBody body;

    public static DescribeActivationCodeDetailsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeActivationCodeDetailsResponse self = new DescribeActivationCodeDetailsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeActivationCodeDetailsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeActivationCodeDetailsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeActivationCodeDetailsResponse setBody(DescribeActivationCodeDetailsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeActivationCodeDetailsResponseBody getBody() {
        return this.body;
    }

}
