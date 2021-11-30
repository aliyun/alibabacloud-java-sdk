// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oss20190517.models;

import com.aliyun.tea.*;

public class DeleteBucketEncryptionResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    public static DeleteBucketEncryptionResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteBucketEncryptionResponse self = new DeleteBucketEncryptionResponse();
        return TeaModel.build(map, self);
    }

    public DeleteBucketEncryptionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

}
