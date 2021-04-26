// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.reid_cloud20201030.models;

import com.aliyun.tea.*;

public class PullTakeShoesEventResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public PullTakeShoesEventResponseBody body;

    public static PullTakeShoesEventResponse build(java.util.Map<String, ?> map) throws Exception {
        PullTakeShoesEventResponse self = new PullTakeShoesEventResponse();
        return TeaModel.build(map, self);
    }

    public PullTakeShoesEventResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PullTakeShoesEventResponse setBody(PullTakeShoesEventResponseBody body) {
        this.body = body;
        return this;
    }
    public PullTakeShoesEventResponseBody getBody() {
        return this.body;
    }

}
