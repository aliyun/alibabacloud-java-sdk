// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeCheckFixDetailsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeCheckFixDetailsResponseBody body;

    public static DescribeCheckFixDetailsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeCheckFixDetailsResponse self = new DescribeCheckFixDetailsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeCheckFixDetailsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeCheckFixDetailsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeCheckFixDetailsResponse setBody(DescribeCheckFixDetailsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeCheckFixDetailsResponseBody getBody() {
        return this.body;
    }

}
