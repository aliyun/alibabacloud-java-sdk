// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeApiNameListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeApiNameListResponseBody body;

    public static DescribeApiNameListResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeApiNameListResponse self = new DescribeApiNameListResponse();
        return TeaModel.build(map, self);
    }

    public DescribeApiNameListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeApiNameListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeApiNameListResponse setBody(DescribeApiNameListResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeApiNameListResponseBody getBody() {
        return this.body;
    }

}
