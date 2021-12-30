// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class VerifyInstanceADAuthServerResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public VerifyInstanceADAuthServerResponseBody body;

    public static VerifyInstanceADAuthServerResponse build(java.util.Map<String, ?> map) throws Exception {
        VerifyInstanceADAuthServerResponse self = new VerifyInstanceADAuthServerResponse();
        return TeaModel.build(map, self);
    }

    public VerifyInstanceADAuthServerResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public VerifyInstanceADAuthServerResponse setBody(VerifyInstanceADAuthServerResponseBody body) {
        this.body = body;
        return this;
    }
    public VerifyInstanceADAuthServerResponseBody getBody() {
        return this.body;
    }

}
