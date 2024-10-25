// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeActivationCodesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeActivationCodesResponseBody body;

    public static DescribeActivationCodesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeActivationCodesResponse self = new DescribeActivationCodesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeActivationCodesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeActivationCodesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeActivationCodesResponse setBody(DescribeActivationCodesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeActivationCodesResponseBody getBody() {
        return this.body;
    }

}
