// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class GrantInstanceToCenResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GrantInstanceToCenResponseBody body;

    public static GrantInstanceToCenResponse build(java.util.Map<String, ?> map) throws Exception {
        GrantInstanceToCenResponse self = new GrantInstanceToCenResponse();
        return TeaModel.build(map, self);
    }

    public GrantInstanceToCenResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GrantInstanceToCenResponse setBody(GrantInstanceToCenResponseBody body) {
        this.body = body;
        return this;
    }
    public GrantInstanceToCenResponseBody getBody() {
        return this.body;
    }

}
