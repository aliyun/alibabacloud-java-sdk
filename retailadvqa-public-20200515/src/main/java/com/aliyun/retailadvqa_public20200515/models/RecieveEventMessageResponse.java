// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailadvqa_public20200515.models;

import com.aliyun.tea.*;

public class RecieveEventMessageResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public RecieveEventMessageResponseBody body;

    public static RecieveEventMessageResponse build(java.util.Map<String, ?> map) throws Exception {
        RecieveEventMessageResponse self = new RecieveEventMessageResponse();
        return TeaModel.build(map, self);
    }

    public RecieveEventMessageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RecieveEventMessageResponse setBody(RecieveEventMessageResponseBody body) {
        this.body = body;
        return this;
    }
    public RecieveEventMessageResponseBody getBody() {
        return this.body;
    }

}
