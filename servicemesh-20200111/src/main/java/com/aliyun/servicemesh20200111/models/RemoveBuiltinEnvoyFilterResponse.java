// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class RemoveBuiltinEnvoyFilterResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public RemoveBuiltinEnvoyFilterResponseBody body;

    public static RemoveBuiltinEnvoyFilterResponse build(java.util.Map<String, ?> map) throws Exception {
        RemoveBuiltinEnvoyFilterResponse self = new RemoveBuiltinEnvoyFilterResponse();
        return TeaModel.build(map, self);
    }

    public RemoveBuiltinEnvoyFilterResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RemoveBuiltinEnvoyFilterResponse setBody(RemoveBuiltinEnvoyFilterResponseBody body) {
        this.body = body;
        return this;
    }
    public RemoveBuiltinEnvoyFilterResponseBody getBody() {
        return this.body;
    }

}
