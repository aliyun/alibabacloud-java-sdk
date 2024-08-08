// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pvtz20180101.models;

import com.aliyun.tea.*;

public class DescribeUserServiceStatusResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeUserServiceStatusResponseBody body;

    public static DescribeUserServiceStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeUserServiceStatusResponse self = new DescribeUserServiceStatusResponse();
        return TeaModel.build(map, self);
    }

    public DescribeUserServiceStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeUserServiceStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeUserServiceStatusResponse setBody(DescribeUserServiceStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeUserServiceStatusResponseBody getBody() {
        return this.body;
    }

}
