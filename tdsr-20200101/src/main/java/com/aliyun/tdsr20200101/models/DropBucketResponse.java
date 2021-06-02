// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.tdsr20200101.models;

import com.aliyun.tea.*;

public class DropBucketResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DropBucketResponseBody body;

    public static DropBucketResponse build(java.util.Map<String, ?> map) throws Exception {
        DropBucketResponse self = new DropBucketResponse();
        return TeaModel.build(map, self);
    }

    public DropBucketResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DropBucketResponse setBody(DropBucketResponseBody body) {
        this.body = body;
        return this;
    }
    public DropBucketResponseBody getBody() {
        return this.body;
    }

}
