// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class DeleteBucketResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteBucketResponseBody body;

    public static DeleteBucketResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteBucketResponse self = new DeleteBucketResponse();
        return TeaModel.build(map, self);
    }

    public DeleteBucketResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteBucketResponse setBody(DeleteBucketResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteBucketResponseBody getBody() {
        return this.body;
    }

}
