// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeUserBaselineAuthorizationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeUserBaselineAuthorizationResponseBody body;

    public static DescribeUserBaselineAuthorizationResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeUserBaselineAuthorizationResponse self = new DescribeUserBaselineAuthorizationResponse();
        return TeaModel.build(map, self);
    }

    public DescribeUserBaselineAuthorizationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeUserBaselineAuthorizationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeUserBaselineAuthorizationResponse setBody(DescribeUserBaselineAuthorizationResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeUserBaselineAuthorizationResponseBody getBody() {
        return this.body;
    }

}
