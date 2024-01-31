// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeImageScanAuthCountResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeImageScanAuthCountResponseBody body;

    public static DescribeImageScanAuthCountResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeImageScanAuthCountResponse self = new DescribeImageScanAuthCountResponse();
        return TeaModel.build(map, self);
    }

    public DescribeImageScanAuthCountResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeImageScanAuthCountResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeImageScanAuthCountResponse setBody(DescribeImageScanAuthCountResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeImageScanAuthCountResponseBody getBody() {
        return this.body;
    }

}
