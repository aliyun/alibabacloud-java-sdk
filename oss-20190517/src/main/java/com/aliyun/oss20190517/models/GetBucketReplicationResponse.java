// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oss20190517.models;

import com.aliyun.tea.*;

public class GetBucketReplicationResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetBucketReplicationResponseBody body;

    public static GetBucketReplicationResponse build(java.util.Map<String, ?> map) throws Exception {
        GetBucketReplicationResponse self = new GetBucketReplicationResponse();
        return TeaModel.build(map, self);
    }

    public GetBucketReplicationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetBucketReplicationResponse setBody(GetBucketReplicationResponseBody body) {
        this.body = body;
        return this;
    }
    public GetBucketReplicationResponseBody getBody() {
        return this.body;
    }

}
