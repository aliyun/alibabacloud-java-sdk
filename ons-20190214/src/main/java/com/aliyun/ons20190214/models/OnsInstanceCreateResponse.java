// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ons20190214.models;

import com.aliyun.tea.*;

public class OnsInstanceCreateResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public OnsInstanceCreateResponseBody body;

    public static OnsInstanceCreateResponse build(java.util.Map<String, ?> map) throws Exception {
        OnsInstanceCreateResponse self = new OnsInstanceCreateResponse();
        return TeaModel.build(map, self);
    }

    public OnsInstanceCreateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public OnsInstanceCreateResponse setBody(OnsInstanceCreateResponseBody body) {
        this.body = body;
        return this;
    }
    public OnsInstanceCreateResponseBody getBody() {
        return this.body;
    }

}
