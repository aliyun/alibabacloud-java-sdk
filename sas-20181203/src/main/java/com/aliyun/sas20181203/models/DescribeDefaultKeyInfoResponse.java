// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeDefaultKeyInfoResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeDefaultKeyInfoResponseBody body;

    public static DescribeDefaultKeyInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDefaultKeyInfoResponse self = new DescribeDefaultKeyInfoResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDefaultKeyInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDefaultKeyInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDefaultKeyInfoResponse setBody(DescribeDefaultKeyInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDefaultKeyInfoResponseBody getBody() {
        return this.body;
    }

}
