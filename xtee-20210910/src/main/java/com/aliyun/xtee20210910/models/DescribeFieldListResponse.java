// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeFieldListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeFieldListResponseBody body;

    public static DescribeFieldListResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeFieldListResponse self = new DescribeFieldListResponse();
        return TeaModel.build(map, self);
    }

    public DescribeFieldListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeFieldListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeFieldListResponse setBody(DescribeFieldListResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeFieldListResponseBody getBody() {
        return this.body;
    }

}
