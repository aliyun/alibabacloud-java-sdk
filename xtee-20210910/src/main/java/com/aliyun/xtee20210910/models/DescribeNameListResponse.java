// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeNameListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeNameListResponseBody body;

    public static DescribeNameListResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeNameListResponse self = new DescribeNameListResponse();
        return TeaModel.build(map, self);
    }

    public DescribeNameListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeNameListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeNameListResponse setBody(DescribeNameListResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeNameListResponseBody getBody() {
        return this.body;
    }

}
