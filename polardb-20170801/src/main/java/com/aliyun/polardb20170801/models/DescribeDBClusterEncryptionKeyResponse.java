// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeDBClusterEncryptionKeyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeDBClusterEncryptionKeyResponseBody body;

    public static DescribeDBClusterEncryptionKeyResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDBClusterEncryptionKeyResponse self = new DescribeDBClusterEncryptionKeyResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDBClusterEncryptionKeyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDBClusterEncryptionKeyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDBClusterEncryptionKeyResponse setBody(DescribeDBClusterEncryptionKeyResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDBClusterEncryptionKeyResponseBody getBody() {
        return this.body;
    }

}
