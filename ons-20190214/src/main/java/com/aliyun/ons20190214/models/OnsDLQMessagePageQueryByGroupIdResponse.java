// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ons20190214.models;

import com.aliyun.tea.*;

public class OnsDLQMessagePageQueryByGroupIdResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public OnsDLQMessagePageQueryByGroupIdResponseBody body;

    public static OnsDLQMessagePageQueryByGroupIdResponse build(java.util.Map<String, ?> map) throws Exception {
        OnsDLQMessagePageQueryByGroupIdResponse self = new OnsDLQMessagePageQueryByGroupIdResponse();
        return TeaModel.build(map, self);
    }

    public OnsDLQMessagePageQueryByGroupIdResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public OnsDLQMessagePageQueryByGroupIdResponse setBody(OnsDLQMessagePageQueryByGroupIdResponseBody body) {
        this.body = body;
        return this;
    }
    public OnsDLQMessagePageQueryByGroupIdResponseBody getBody() {
        return this.body;
    }

}
