// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.r_kvstore20150101.models;

import com.aliyun.tea.*;

public class DescribeEncryptionKeyResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public DescribeEncryptionKeyResponse setBody(DescribeEncryptionKeyResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeEncryptionKeyResponseBody getBody() {
        return this.body;
    }

}
