// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.reid_cloud20201030.models;

import com.aliyun.tea.*;

public class PullTryOnShoesEventResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public PullTryOnShoesEventResponseBody body;

    public static PullTryOnShoesEventResponse build(java.util.Map<String, ?> map) throws Exception {
        PullTryOnShoesEventResponse self = new PullTryOnShoesEventResponse();
        return TeaModel.build(map, self);
    }

    public PullTryOnShoesEventResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PullTryOnShoesEventResponse setBody(PullTryOnShoesEventResponseBody body) {
        this.body = body;
        return this;
    }
    public PullTryOnShoesEventResponseBody getBody() {
        return this.body;
    }

}
