// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeCountNotScannedImageResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeCountNotScannedImageResponseBody body;

    public static DescribeCountNotScannedImageResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeCountNotScannedImageResponse self = new DescribeCountNotScannedImageResponse();
        return TeaModel.build(map, self);
    }

    public DescribeCountNotScannedImageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeCountNotScannedImageResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeCountNotScannedImageResponse setBody(DescribeCountNotScannedImageResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeCountNotScannedImageResponseBody getBody() {
        return this.body;
    }

}
