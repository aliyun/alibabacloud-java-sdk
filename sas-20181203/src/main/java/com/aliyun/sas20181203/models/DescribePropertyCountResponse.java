// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribePropertyCountResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribePropertyCountResponseBody body;

    public static DescribePropertyCountResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribePropertyCountResponse self = new DescribePropertyCountResponse();
        return TeaModel.build(map, self);
    }

    public DescribePropertyCountResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribePropertyCountResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribePropertyCountResponse setBody(DescribePropertyCountResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribePropertyCountResponseBody getBody() {
        return this.body;
    }

}
