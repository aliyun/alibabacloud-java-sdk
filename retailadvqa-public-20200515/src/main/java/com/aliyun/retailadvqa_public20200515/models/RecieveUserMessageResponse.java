// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailadvqa_public20200515.models;

import com.aliyun.tea.*;

public class RecieveUserMessageResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public RecieveUserMessageResponseBody body;

    public static RecieveUserMessageResponse build(java.util.Map<String, ?> map) throws Exception {
        RecieveUserMessageResponse self = new RecieveUserMessageResponse();
        return TeaModel.build(map, self);
    }

    public RecieveUserMessageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RecieveUserMessageResponse setBody(RecieveUserMessageResponseBody body) {
        this.body = body;
        return this;
    }
    public RecieveUserMessageResponseBody getBody() {
        return this.body;
    }

}
