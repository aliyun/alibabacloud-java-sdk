// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class DescribeSessionListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeSessionListResponseBody body;

    public static DescribeSessionListResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeSessionListResponse self = new DescribeSessionListResponse();
        return TeaModel.build(map, self);
    }

    public DescribeSessionListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeSessionListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeSessionListResponse setBody(DescribeSessionListResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeSessionListResponseBody getBody() {
        return this.body;
    }

}
