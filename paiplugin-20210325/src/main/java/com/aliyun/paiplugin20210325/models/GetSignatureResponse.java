// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paiplugin20210325.models;

import com.aliyun.tea.*;

public class GetSignatureResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetSignatureResponseBody body;

    public static GetSignatureResponse build(java.util.Map<String, ?> map) throws Exception {
        GetSignatureResponse self = new GetSignatureResponse();
        return TeaModel.build(map, self);
    }

    public GetSignatureResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetSignatureResponse setBody(GetSignatureResponseBody body) {
        this.body = body;
        return this;
    }
    public GetSignatureResponseBody getBody() {
        return this.body;
    }

}
