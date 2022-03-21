// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rmcore20220121.models;

import com.aliyun.tea.*;

public class DisableResourceTypeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DisableResourceTypeResponseBody body;

    public static DisableResourceTypeResponse build(java.util.Map<String, ?> map) throws Exception {
        DisableResourceTypeResponse self = new DisableResourceTypeResponse();
        return TeaModel.build(map, self);
    }

    public DisableResourceTypeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DisableResourceTypeResponse setBody(DisableResourceTypeResponseBody body) {
        this.body = body;
        return this;
    }
    public DisableResourceTypeResponseBody getBody() {
        return this.body;
    }

}
