// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class UnbindEsInstanceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UnbindEsInstanceResponseBody body;

    public static UnbindEsInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        UnbindEsInstanceResponse self = new UnbindEsInstanceResponse();
        return TeaModel.build(map, self);
    }

    public UnbindEsInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UnbindEsInstanceResponse setBody(UnbindEsInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public UnbindEsInstanceResponseBody getBody() {
        return this.body;
    }

}
