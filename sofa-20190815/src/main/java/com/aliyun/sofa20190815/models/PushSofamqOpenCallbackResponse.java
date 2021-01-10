// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class PushSofamqOpenCallbackResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public PushSofamqOpenCallbackResponseBody body;

    public static PushSofamqOpenCallbackResponse build(java.util.Map<String, ?> map) throws Exception {
        PushSofamqOpenCallbackResponse self = new PushSofamqOpenCallbackResponse();
        return TeaModel.build(map, self);
    }

    public PushSofamqOpenCallbackResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PushSofamqOpenCallbackResponse setBody(PushSofamqOpenCallbackResponseBody body) {
        this.body = body;
        return this;
    }
    public PushSofamqOpenCallbackResponseBody getBody() {
        return this.body;
    }

}
