// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class SubscribeSpaceEventResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public SubscribeSpaceEventResponseBody body;

    public static SubscribeSpaceEventResponse build(java.util.Map<String, ?> map) throws Exception {
        SubscribeSpaceEventResponse self = new SubscribeSpaceEventResponse();
        return TeaModel.build(map, self);
    }

    public SubscribeSpaceEventResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SubscribeSpaceEventResponse setBody(SubscribeSpaceEventResponseBody body) {
        this.body = body;
        return this;
    }
    public SubscribeSpaceEventResponseBody getBody() {
        return this.body;
    }

}
