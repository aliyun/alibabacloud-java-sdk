// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xixikf20200730.models;

import com.aliyun.tea.*;

public class UpdateRingStatusResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateRingStatusResponseBody body;

    public static UpdateRingStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateRingStatusResponse self = new UpdateRingStatusResponse();
        return TeaModel.build(map, self);
    }

    public UpdateRingStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateRingStatusResponse setBody(UpdateRingStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateRingStatusResponseBody getBody() {
        return this.body;
    }

}
