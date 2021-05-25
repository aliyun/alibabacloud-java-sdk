// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class ModifyBuiltinEnvoyFilterResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ModifyBuiltinEnvoyFilterResponseBody body;

    public static ModifyBuiltinEnvoyFilterResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyBuiltinEnvoyFilterResponse self = new ModifyBuiltinEnvoyFilterResponse();
        return TeaModel.build(map, self);
    }

    public ModifyBuiltinEnvoyFilterResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyBuiltinEnvoyFilterResponse setBody(ModifyBuiltinEnvoyFilterResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyBuiltinEnvoyFilterResponseBody getBody() {
        return this.body;
    }

}
