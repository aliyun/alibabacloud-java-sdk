// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeEncryptionDBSecretResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeEncryptionDBSecretResponseBody body;

    public static DescribeEncryptionDBSecretResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeEncryptionDBSecretResponse self = new DescribeEncryptionDBSecretResponse();
        return TeaModel.build(map, self);
    }

    public DescribeEncryptionDBSecretResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeEncryptionDBSecretResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeEncryptionDBSecretResponse setBody(DescribeEncryptionDBSecretResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeEncryptionDBSecretResponseBody getBody() {
        return this.body;
    }

}
