// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class KickOutClientsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public KickOutClientsResponseBody body;

    public static KickOutClientsResponse build(java.util.Map<String, ?> map) throws Exception {
        KickOutClientsResponse self = new KickOutClientsResponse();
        return TeaModel.build(map, self);
    }

    public KickOutClientsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public KickOutClientsResponse setBody(KickOutClientsResponseBody body) {
        this.body = body;
        return this;
    }
    public KickOutClientsResponseBody getBody() {
        return this.body;
    }

}
