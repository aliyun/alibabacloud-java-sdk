// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class UnsubscribeSpaceEventResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UnsubscribeSpaceEventResponseBody body;

    public static UnsubscribeSpaceEventResponse build(java.util.Map<String, ?> map) throws Exception {
        UnsubscribeSpaceEventResponse self = new UnsubscribeSpaceEventResponse();
        return TeaModel.build(map, self);
    }

    public UnsubscribeSpaceEventResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UnsubscribeSpaceEventResponse setBody(UnsubscribeSpaceEventResponseBody body) {
        this.body = body;
        return this;
    }
    public UnsubscribeSpaceEventResponseBody getBody() {
        return this.body;
    }

}
