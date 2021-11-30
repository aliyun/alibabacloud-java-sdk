// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oss20190517.models;

import com.aliyun.tea.*;

public class GetBucketTransferAccelerationResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetBucketTransferAccelerationResponseBody body;

    public static GetBucketTransferAccelerationResponse build(java.util.Map<String, ?> map) throws Exception {
        GetBucketTransferAccelerationResponse self = new GetBucketTransferAccelerationResponse();
        return TeaModel.build(map, self);
    }

    public GetBucketTransferAccelerationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetBucketTransferAccelerationResponse setBody(GetBucketTransferAccelerationResponseBody body) {
        this.body = body;
        return this;
    }
    public GetBucketTransferAccelerationResponseBody getBody() {
        return this.body;
    }

}
