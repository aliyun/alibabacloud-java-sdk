// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class GetBuiltinEnvoyFilterResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetBuiltinEnvoyFilterResponseBody body;

    public static GetBuiltinEnvoyFilterResponse build(java.util.Map<String, ?> map) throws Exception {
        GetBuiltinEnvoyFilterResponse self = new GetBuiltinEnvoyFilterResponse();
        return TeaModel.build(map, self);
    }

    public GetBuiltinEnvoyFilterResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetBuiltinEnvoyFilterResponse setBody(GetBuiltinEnvoyFilterResponseBody body) {
        this.body = body;
        return this;
    }
    public GetBuiltinEnvoyFilterResponseBody getBody() {
        return this.body;
    }

}
