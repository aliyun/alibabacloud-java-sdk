// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeCountScannedImageResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeCountScannedImageResponseBody body;

    public static DescribeCountScannedImageResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeCountScannedImageResponse self = new DescribeCountScannedImageResponse();
        return TeaModel.build(map, self);
    }

    public DescribeCountScannedImageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeCountScannedImageResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeCountScannedImageResponse setBody(DescribeCountScannedImageResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeCountScannedImageResponseBody getBody() {
        return this.body;
    }

}
