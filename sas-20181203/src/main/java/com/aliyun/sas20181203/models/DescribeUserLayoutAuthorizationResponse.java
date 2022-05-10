// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeUserLayoutAuthorizationResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeUserLayoutAuthorizationResponseBody body;

    public static DescribeUserLayoutAuthorizationResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeUserLayoutAuthorizationResponse self = new DescribeUserLayoutAuthorizationResponse();
        return TeaModel.build(map, self);
    }

    public DescribeUserLayoutAuthorizationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeUserLayoutAuthorizationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeUserLayoutAuthorizationResponse setBody(DescribeUserLayoutAuthorizationResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeUserLayoutAuthorizationResponseBody getBody() {
        return this.body;
    }

}
