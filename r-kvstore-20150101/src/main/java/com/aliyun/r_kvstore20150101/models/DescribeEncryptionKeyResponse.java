// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.r_kvstore20150101.models;

import com.aliyun.tea.*;

public class DescribeEncryptionKeyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeEncryptionKeyResponseBody body;

    public static DescribeEncryptionKeyResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeEncryptionKeyResponse self = new DescribeEncryptionKeyResponse();
        return TeaModel.build(map, self);
    }

    public DescribeEncryptionKeyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeEncryptionKeyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeEncryptionKeyResponse setBody(DescribeEncryptionKeyResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeEncryptionKeyResponseBody getBody() {
        return this.body;
    }

}
