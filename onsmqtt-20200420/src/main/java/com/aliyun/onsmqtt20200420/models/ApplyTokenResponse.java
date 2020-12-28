// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.onsmqtt20200420.models;

import com.aliyun.tea.*;

public class ApplyTokenResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ApplyTokenResponseBody body;

    public static ApplyTokenResponse build(java.util.Map<String, ?> map) throws Exception {
        ApplyTokenResponse self = new ApplyTokenResponse();
        return TeaModel.build(map, self);
    }

    public ApplyTokenResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ApplyTokenResponse setBody(ApplyTokenResponseBody body) {
        this.body = body;
        return this;
    }
    public ApplyTokenResponseBody getBody() {
        return this.body;
    }

}
