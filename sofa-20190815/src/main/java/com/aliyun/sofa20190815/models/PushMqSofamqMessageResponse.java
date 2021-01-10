// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class PushMqSofamqMessageResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public PushMqSofamqMessageResponseBody body;

    public static PushMqSofamqMessageResponse build(java.util.Map<String, ?> map) throws Exception {
        PushMqSofamqMessageResponse self = new PushMqSofamqMessageResponse();
        return TeaModel.build(map, self);
    }

    public PushMqSofamqMessageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PushMqSofamqMessageResponse setBody(PushMqSofamqMessageResponseBody body) {
        this.body = body;
        return this;
    }
    public PushMqSofamqMessageResponseBody getBody() {
        return this.body;
    }

}
