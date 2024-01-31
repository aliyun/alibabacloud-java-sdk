// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeImageScanAuthorizationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeImageScanAuthorizationResponseBody body;

    public static DescribeImageScanAuthorizationResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeImageScanAuthorizationResponse self = new DescribeImageScanAuthorizationResponse();
        return TeaModel.build(map, self);
    }

    public DescribeImageScanAuthorizationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeImageScanAuthorizationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeImageScanAuthorizationResponse setBody(DescribeImageScanAuthorizationResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeImageScanAuthorizationResponseBody getBody() {
        return this.body;
    }

}
