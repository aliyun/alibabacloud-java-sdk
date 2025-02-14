// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeImageSecurityScanCountResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeImageSecurityScanCountResponseBody body;

    public static DescribeImageSecurityScanCountResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeImageSecurityScanCountResponse self = new DescribeImageSecurityScanCountResponse();
        return TeaModel.build(map, self);
    }

    public DescribeImageSecurityScanCountResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeImageSecurityScanCountResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeImageSecurityScanCountResponse setBody(DescribeImageSecurityScanCountResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeImageSecurityScanCountResponseBody getBody() {
        return this.body;
    }

}
