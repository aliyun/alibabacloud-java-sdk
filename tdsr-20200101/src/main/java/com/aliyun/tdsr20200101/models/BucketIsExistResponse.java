// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.tdsr20200101.models;

import com.aliyun.tea.*;

public class BucketIsExistResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public BucketIsExistResponseBody body;

    public static BucketIsExistResponse build(java.util.Map<String, ?> map) throws Exception {
        BucketIsExistResponse self = new BucketIsExistResponse();
        return TeaModel.build(map, self);
    }

    public BucketIsExistResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public BucketIsExistResponse setBody(BucketIsExistResponseBody body) {
        this.body = body;
        return this;
    }
    public BucketIsExistResponseBody getBody() {
        return this.body;
    }

}
