// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.r_kvstore20150101.models;

import com.aliyun.tea.*;

public class DescribeEncryptionKeyListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public DescribeEncryptionKeyListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeEncryptionKeyListResponse setBody(DescribeEncryptionKeyListResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeEncryptionKeyListResponseBody getBody() {
        return this.body;
    }

}
