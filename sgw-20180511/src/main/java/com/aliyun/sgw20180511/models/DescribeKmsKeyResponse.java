// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sgw20180511.models;

import com.aliyun.tea.*;

public class DescribeKmsKeyResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeKmsKeyResponseBody body;

    public static DescribeKmsKeyResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeKmsKeyResponse self = new DescribeKmsKeyResponse();
        return TeaModel.build(map, self);
    }

    public DescribeKmsKeyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeKmsKeyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeKmsKeyResponse setBody(DescribeKmsKeyResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeKmsKeyResponseBody getBody() {
        return this.body;
    }

}
