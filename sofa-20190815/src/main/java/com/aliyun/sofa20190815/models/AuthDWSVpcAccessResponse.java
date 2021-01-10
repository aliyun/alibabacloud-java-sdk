// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class AuthDWSVpcAccessResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public AuthDWSVpcAccessResponseBody body;

    public static AuthDWSVpcAccessResponse build(java.util.Map<String, ?> map) throws Exception {
        AuthDWSVpcAccessResponse self = new AuthDWSVpcAccessResponse();
        return TeaModel.build(map, self);
    }

    public AuthDWSVpcAccessResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AuthDWSVpcAccessResponse setBody(AuthDWSVpcAccessResponseBody body) {
        this.body = body;
        return this;
    }
    public AuthDWSVpcAccessResponseBody getBody() {
        return this.body;
    }

}
