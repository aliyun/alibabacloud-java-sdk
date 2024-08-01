// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pvtz20180101.models;

import com.aliyun.tea.*;

public class DescribeCustomLineInfoResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeCustomLineInfoResponseBody body;

    public static DescribeCustomLineInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeCustomLineInfoResponse self = new DescribeCustomLineInfoResponse();
        return TeaModel.build(map, self);
    }

    public DescribeCustomLineInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeCustomLineInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeCustomLineInfoResponse setBody(DescribeCustomLineInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeCustomLineInfoResponseBody getBody() {
        return this.body;
    }

}
