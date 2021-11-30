// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oss20190517.models;

import com.aliyun.tea.*;

public class GetBucketInventoryResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetBucketInventoryResponseBody body;

    public static GetBucketInventoryResponse build(java.util.Map<String, ?> map) throws Exception {
        GetBucketInventoryResponse self = new GetBucketInventoryResponse();
        return TeaModel.build(map, self);
    }

    public GetBucketInventoryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetBucketInventoryResponse setBody(GetBucketInventoryResponseBody body) {
        this.body = body;
        return this;
    }
    public GetBucketInventoryResponseBody getBody() {
        return this.body;
    }

}
