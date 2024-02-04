// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeDBLinksResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeDBLinksResponseBody body;

    public static DescribeDBLinksResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDBLinksResponse self = new DescribeDBLinksResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDBLinksResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDBLinksResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDBLinksResponse setBody(DescribeDBLinksResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDBLinksResponseBody getBody() {
        return this.body;
    }

}
