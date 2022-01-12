// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.r_kvstore20150101.models;

import com.aliyun.tea.*;

public class DescribeEncryptionKeyListResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeEncryptionKeyListResponseBody body;

    public static DescribeEncryptionKeyListResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeEncryptionKeyListResponse self = new DescribeEncryptionKeyListResponse();
        return TeaModel.build(map, self);
    }

    public DescribeEncryptionKeyListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeEncryptionKeyListResponse setBody(DescribeEncryptionKeyListResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeEncryptionKeyListResponseBody getBody() {
        return this.body;
    }

}
