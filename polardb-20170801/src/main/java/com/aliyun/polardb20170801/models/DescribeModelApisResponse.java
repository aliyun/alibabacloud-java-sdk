// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeModelApisResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeModelApisResponseBody body;

    public static DescribeModelApisResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeModelApisResponse self = new DescribeModelApisResponse();
        return TeaModel.build(map, self);
    }

    public DescribeModelApisResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeModelApisResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeModelApisResponse setBody(DescribeModelApisResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeModelApisResponseBody getBody() {
        return this.body;
    }

}
