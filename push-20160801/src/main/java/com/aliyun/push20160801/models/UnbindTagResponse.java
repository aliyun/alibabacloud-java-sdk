// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.push20160801.models;

import com.aliyun.tea.*;

public class UnbindTagResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UnbindTagResponseBody body;

    public static UnbindTagResponse build(java.util.Map<String, ?> map) throws Exception {
        UnbindTagResponse self = new UnbindTagResponse();
        return TeaModel.build(map, self);
    }

    public UnbindTagResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UnbindTagResponse setBody(UnbindTagResponseBody body) {
        this.body = body;
        return this;
    }
    public UnbindTagResponseBody getBody() {
        return this.body;
    }

}
