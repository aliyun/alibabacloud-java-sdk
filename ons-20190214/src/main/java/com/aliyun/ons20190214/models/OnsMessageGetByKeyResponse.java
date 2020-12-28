// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ons20190214.models;

import com.aliyun.tea.*;

public class OnsMessageGetByKeyResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public OnsMessageGetByKeyResponseBody body;

    public static OnsMessageGetByKeyResponse build(java.util.Map<String, ?> map) throws Exception {
        OnsMessageGetByKeyResponse self = new OnsMessageGetByKeyResponse();
        return TeaModel.build(map, self);
    }

    public OnsMessageGetByKeyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public OnsMessageGetByKeyResponse setBody(OnsMessageGetByKeyResponseBody body) {
        this.body = body;
        return this;
    }
    public OnsMessageGetByKeyResponseBody getBody() {
        return this.body;
    }

}
