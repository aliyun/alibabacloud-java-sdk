// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class SignEventActionResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public SignEventActionResponseBody body;

    public static SignEventActionResponse build(java.util.Map<String, ?> map) throws Exception {
        SignEventActionResponse self = new SignEventActionResponse();
        return TeaModel.build(map, self);
    }

    public SignEventActionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SignEventActionResponse setBody(SignEventActionResponseBody body) {
        this.body = body;
        return this;
    }
    public SignEventActionResponseBody getBody() {
        return this.body;
    }

}
