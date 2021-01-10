// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class SkipTSActivityInstanceWaitingEventResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public SkipTSActivityInstanceWaitingEventResponseBody body;

    public static SkipTSActivityInstanceWaitingEventResponse build(java.util.Map<String, ?> map) throws Exception {
        SkipTSActivityInstanceWaitingEventResponse self = new SkipTSActivityInstanceWaitingEventResponse();
        return TeaModel.build(map, self);
    }

    public SkipTSActivityInstanceWaitingEventResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SkipTSActivityInstanceWaitingEventResponse setBody(SkipTSActivityInstanceWaitingEventResponseBody body) {
        this.body = body;
        return this;
    }
    public SkipTSActivityInstanceWaitingEventResponseBody getBody() {
        return this.body;
    }

}
