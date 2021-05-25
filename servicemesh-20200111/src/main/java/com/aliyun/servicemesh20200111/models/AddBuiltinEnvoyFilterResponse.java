// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class AddBuiltinEnvoyFilterResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public AddBuiltinEnvoyFilterResponseBody body;

    public static AddBuiltinEnvoyFilterResponse build(java.util.Map<String, ?> map) throws Exception {
        AddBuiltinEnvoyFilterResponse self = new AddBuiltinEnvoyFilterResponse();
        return TeaModel.build(map, self);
    }

    public AddBuiltinEnvoyFilterResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddBuiltinEnvoyFilterResponse setBody(AddBuiltinEnvoyFilterResponseBody body) {
        this.body = body;
        return this;
    }
    public AddBuiltinEnvoyFilterResponseBody getBody() {
        return this.body;
    }

}
