// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class PushSofamqPayCallbackResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public PushSofamqPayCallbackResponseBody body;

    public static PushSofamqPayCallbackResponse build(java.util.Map<String, ?> map) throws Exception {
        PushSofamqPayCallbackResponse self = new PushSofamqPayCallbackResponse();
        return TeaModel.build(map, self);
    }

    public PushSofamqPayCallbackResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PushSofamqPayCallbackResponse setBody(PushSofamqPayCallbackResponseBody body) {
        this.body = body;
        return this;
    }
    public PushSofamqPayCallbackResponseBody getBody() {
        return this.body;
    }

}
