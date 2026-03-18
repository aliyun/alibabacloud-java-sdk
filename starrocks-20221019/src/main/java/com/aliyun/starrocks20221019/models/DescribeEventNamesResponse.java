// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.starrocks20221019.models;

import com.aliyun.tea.*;

public class DescribeEventNamesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeEventNamesResponseBody body;

    public static DescribeEventNamesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeEventNamesResponse self = new DescribeEventNamesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeEventNamesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeEventNamesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeEventNamesResponse setBody(DescribeEventNamesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeEventNamesResponseBody getBody() {
        return this.body;
    }

}
