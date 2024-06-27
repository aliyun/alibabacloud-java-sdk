// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeEventResultListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeEventResultListResponseBody body;

    public static DescribeEventResultListResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeEventResultListResponse self = new DescribeEventResultListResponse();
        return TeaModel.build(map, self);
    }

    public DescribeEventResultListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeEventResultListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeEventResultListResponse setBody(DescribeEventResultListResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeEventResultListResponseBody getBody() {
        return this.body;
    }

}
