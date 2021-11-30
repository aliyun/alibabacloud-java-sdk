// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oss20190517.models;

import com.aliyun.tea.*;

public class GetBucketInfoResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetBucketInfoResponseBody body;

    public static GetBucketInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        GetBucketInfoResponse self = new GetBucketInfoResponse();
        return TeaModel.build(map, self);
    }

    public GetBucketInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetBucketInfoResponse setBody(GetBucketInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public GetBucketInfoResponseBody getBody() {
        return this.body;
    }

}
