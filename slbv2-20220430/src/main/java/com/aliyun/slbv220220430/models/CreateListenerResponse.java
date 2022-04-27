// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.slbv220220430.models;

import com.aliyun.tea.*;

public class CreateListenerResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateListenerResponseBody body;

    public static CreateListenerResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateListenerResponse self = new CreateListenerResponse();
        return TeaModel.build(map, self);
    }

    public CreateListenerResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateListenerResponse setBody(CreateListenerResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateListenerResponseBody getBody() {
        return this.body;
    }

}
