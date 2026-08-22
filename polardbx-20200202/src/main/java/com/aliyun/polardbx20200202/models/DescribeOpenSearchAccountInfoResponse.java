// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class DescribeOpenSearchAccountInfoResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeOpenSearchAccountInfoResponseBody body;

    public static DescribeOpenSearchAccountInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeOpenSearchAccountInfoResponse self = new DescribeOpenSearchAccountInfoResponse();
        return TeaModel.build(map, self);
    }

    public DescribeOpenSearchAccountInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeOpenSearchAccountInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeOpenSearchAccountInfoResponse setBody(DescribeOpenSearchAccountInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeOpenSearchAccountInfoResponseBody getBody() {
        return this.body;
    }

}
