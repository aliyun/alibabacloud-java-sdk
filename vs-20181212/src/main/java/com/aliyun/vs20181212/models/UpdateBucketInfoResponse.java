// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class UpdateBucketInfoResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateBucketInfoResponseBody body;

    public static UpdateBucketInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateBucketInfoResponse self = new UpdateBucketInfoResponse();
        return TeaModel.build(map, self);
    }

    public UpdateBucketInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateBucketInfoResponse setBody(UpdateBucketInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateBucketInfoResponseBody getBody() {
        return this.body;
    }

}
