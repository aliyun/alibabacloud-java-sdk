// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nlp_automl20190701.models;

import com.aliyun.tea.*;

public class InvokeActionResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public InvokeActionResponseBody body;

    public static InvokeActionResponse build(java.util.Map<String, ?> map) throws Exception {
        InvokeActionResponse self = new InvokeActionResponse();
        return TeaModel.build(map, self);
    }

    public InvokeActionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public InvokeActionResponse setBody(InvokeActionResponseBody body) {
        this.body = body;
        return this;
    }
    public InvokeActionResponseBody getBody() {
        return this.body;
    }

}
