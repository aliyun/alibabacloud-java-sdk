// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.risk20160713.models;

import com.aliyun.tea.*;

public class VerifyIvTokenResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public VerifyIvTokenResponseBody body;

    public static VerifyIvTokenResponse build(java.util.Map<String, ?> map) throws Exception {
        VerifyIvTokenResponse self = new VerifyIvTokenResponse();
        return TeaModel.build(map, self);
    }

    public VerifyIvTokenResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public VerifyIvTokenResponse setBody(VerifyIvTokenResponseBody body) {
        this.body = body;
        return this;
    }
    public VerifyIvTokenResponseBody getBody() {
        return this.body;
    }

}
