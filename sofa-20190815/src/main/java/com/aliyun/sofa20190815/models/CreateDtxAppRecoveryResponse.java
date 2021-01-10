// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CreateDtxAppRecoveryResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateDtxAppRecoveryResponseBody body;

    public static CreateDtxAppRecoveryResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateDtxAppRecoveryResponse self = new CreateDtxAppRecoveryResponse();
        return TeaModel.build(map, self);
    }

    public CreateDtxAppRecoveryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateDtxAppRecoveryResponse setBody(CreateDtxAppRecoveryResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateDtxAppRecoveryResponseBody getBody() {
        return this.body;
    }

}
