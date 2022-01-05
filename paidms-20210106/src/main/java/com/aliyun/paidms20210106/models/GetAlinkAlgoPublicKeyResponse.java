// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paidms20210106.models;

import com.aliyun.tea.*;

public class GetAlinkAlgoPublicKeyResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetAlinkAlgoPublicKeyResponseBody body;

    public static GetAlinkAlgoPublicKeyResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAlinkAlgoPublicKeyResponse self = new GetAlinkAlgoPublicKeyResponse();
        return TeaModel.build(map, self);
    }

    public GetAlinkAlgoPublicKeyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetAlinkAlgoPublicKeyResponse setBody(GetAlinkAlgoPublicKeyResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAlinkAlgoPublicKeyResponseBody getBody() {
        return this.body;
    }

}
