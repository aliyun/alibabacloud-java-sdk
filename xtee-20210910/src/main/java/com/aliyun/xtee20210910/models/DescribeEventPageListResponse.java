// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeEventPageListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeEventPageListResponseBody body;

    public static DescribeEventPageListResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeEventPageListResponse self = new DescribeEventPageListResponse();
        return TeaModel.build(map, self);
    }

    public DescribeEventPageListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeEventPageListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeEventPageListResponse setBody(DescribeEventPageListResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeEventPageListResponseBody getBody() {
        return this.body;
    }

}
