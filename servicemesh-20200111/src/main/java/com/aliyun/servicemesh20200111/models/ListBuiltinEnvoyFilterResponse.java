// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class ListBuiltinEnvoyFilterResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListBuiltinEnvoyFilterResponseBody body;

    public static ListBuiltinEnvoyFilterResponse build(java.util.Map<String, ?> map) throws Exception {
        ListBuiltinEnvoyFilterResponse self = new ListBuiltinEnvoyFilterResponse();
        return TeaModel.build(map, self);
    }

    public ListBuiltinEnvoyFilterResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListBuiltinEnvoyFilterResponse setBody(ListBuiltinEnvoyFilterResponseBody body) {
        this.body = body;
        return this;
    }
    public ListBuiltinEnvoyFilterResponseBody getBody() {
        return this.body;
    }

}
