// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sddp20190103.models;

import com.aliyun.tea.*;

public class DescribeUserStatusResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeUserStatusResponseBody body;

    public static DescribeUserStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeUserStatusResponse self = new DescribeUserStatusResponse();
        return TeaModel.build(map, self);
    }

    public DescribeUserStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeUserStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeUserStatusResponse setBody(DescribeUserStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeUserStatusResponseBody getBody() {
        return this.body;
    }

}
