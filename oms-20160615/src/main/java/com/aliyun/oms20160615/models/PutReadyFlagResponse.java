// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oms20160615.models;

import com.aliyun.tea.*;

public class PutReadyFlagResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public PutReadyFlagResponseBody body;

    public static PutReadyFlagResponse build(java.util.Map<String, ?> map) throws Exception {
        PutReadyFlagResponse self = new PutReadyFlagResponse();
        return TeaModel.build(map, self);
    }

    public PutReadyFlagResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PutReadyFlagResponse setBody(PutReadyFlagResponseBody body) {
        this.body = body;
        return this;
    }
    public PutReadyFlagResponseBody getBody() {
        return this.body;
    }

}
