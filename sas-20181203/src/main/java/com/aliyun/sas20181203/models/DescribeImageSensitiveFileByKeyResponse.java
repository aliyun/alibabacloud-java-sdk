// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeImageSensitiveFileByKeyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeImageSensitiveFileByKeyResponseBody body;

    public static DescribeImageSensitiveFileByKeyResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeImageSensitiveFileByKeyResponse self = new DescribeImageSensitiveFileByKeyResponse();
        return TeaModel.build(map, self);
    }

    public DescribeImageSensitiveFileByKeyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeImageSensitiveFileByKeyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeImageSensitiveFileByKeyResponse setBody(DescribeImageSensitiveFileByKeyResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeImageSensitiveFileByKeyResponseBody getBody() {
        return this.body;
    }

}
