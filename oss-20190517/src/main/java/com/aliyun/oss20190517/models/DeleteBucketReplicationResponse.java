// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oss20190517.models;

import com.aliyun.tea.*;

public class DeleteBucketReplicationResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteBucketReplicationResponseBody body;

    public static DeleteBucketReplicationResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteBucketReplicationResponse self = new DeleteBucketReplicationResponse();
        return TeaModel.build(map, self);
    }

    public DeleteBucketReplicationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteBucketReplicationResponse setBody(DeleteBucketReplicationResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteBucketReplicationResponseBody getBody() {
        return this.body;
    }

}
