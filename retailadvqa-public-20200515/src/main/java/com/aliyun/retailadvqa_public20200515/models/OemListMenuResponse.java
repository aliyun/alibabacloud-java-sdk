// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailadvqa_public20200515.models;

import com.aliyun.tea.*;

public class OemListMenuResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public OemListMenuResponseBody body;

    public static OemListMenuResponse build(java.util.Map<String, ?> map) throws Exception {
        OemListMenuResponse self = new OemListMenuResponse();
        return TeaModel.build(map, self);
    }

    public OemListMenuResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public OemListMenuResponse setBody(OemListMenuResponseBody body) {
        this.body = body;
        return this;
    }
    public OemListMenuResponseBody getBody() {
        return this.body;
    }

}
