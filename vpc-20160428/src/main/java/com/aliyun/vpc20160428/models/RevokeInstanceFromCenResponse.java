// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class RevokeInstanceFromCenResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public RevokeInstanceFromCenResponseBody body;

    public static RevokeInstanceFromCenResponse build(java.util.Map<String, ?> map) throws Exception {
        RevokeInstanceFromCenResponse self = new RevokeInstanceFromCenResponse();
        return TeaModel.build(map, self);
    }

    public RevokeInstanceFromCenResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RevokeInstanceFromCenResponse setBody(RevokeInstanceFromCenResponseBody body) {
        this.body = body;
        return this;
    }
    public RevokeInstanceFromCenResponseBody getBody() {
        return this.body;
    }

}
