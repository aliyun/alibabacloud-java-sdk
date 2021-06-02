// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.tdsr20200101.models;

import com.aliyun.tea.*;

public class RectVerticalResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public RectVerticalResponseBody body;

    public static RectVerticalResponse build(java.util.Map<String, ?> map) throws Exception {
        RectVerticalResponse self = new RectVerticalResponse();
        return TeaModel.build(map, self);
    }

    public RectVerticalResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RectVerticalResponse setBody(RectVerticalResponseBody body) {
        this.body = body;
        return this;
    }
    public RectVerticalResponseBody getBody() {
        return this.body;
    }

}
