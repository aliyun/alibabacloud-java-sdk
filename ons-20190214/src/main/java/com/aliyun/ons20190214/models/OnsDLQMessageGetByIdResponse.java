// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ons20190214.models;

import com.aliyun.tea.*;

public class OnsDLQMessageGetByIdResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public OnsDLQMessageGetByIdResponseBody body;

    public static OnsDLQMessageGetByIdResponse build(java.util.Map<String, ?> map) throws Exception {
        OnsDLQMessageGetByIdResponse self = new OnsDLQMessageGetByIdResponse();
        return TeaModel.build(map, self);
    }

    public OnsDLQMessageGetByIdResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public OnsDLQMessageGetByIdResponse setBody(OnsDLQMessageGetByIdResponseBody body) {
        this.body = body;
        return this;
    }
    public OnsDLQMessageGetByIdResponseBody getBody() {
        return this.body;
    }

}
