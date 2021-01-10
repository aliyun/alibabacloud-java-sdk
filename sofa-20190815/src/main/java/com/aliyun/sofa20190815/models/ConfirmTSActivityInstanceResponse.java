// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ConfirmTSActivityInstanceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ConfirmTSActivityInstanceResponseBody body;

    public static ConfirmTSActivityInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        ConfirmTSActivityInstanceResponse self = new ConfirmTSActivityInstanceResponse();
        return TeaModel.build(map, self);
    }

    public ConfirmTSActivityInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ConfirmTSActivityInstanceResponse setBody(ConfirmTSActivityInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public ConfirmTSActivityInstanceResponseBody getBody() {
        return this.body;
    }

}
