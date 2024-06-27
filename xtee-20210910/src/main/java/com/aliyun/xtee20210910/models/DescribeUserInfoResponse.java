// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeUserInfoResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeUserInfoResponseBody body;

    public static DescribeUserInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeUserInfoResponse self = new DescribeUserInfoResponse();
        return TeaModel.build(map, self);
    }

    public DescribeUserInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeUserInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeUserInfoResponse setBody(DescribeUserInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeUserInfoResponseBody getBody() {
        return this.body;
    }

}
