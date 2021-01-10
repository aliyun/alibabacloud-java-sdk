// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CancelTSActivityInstanceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CancelTSActivityInstanceResponseBody body;

    public static CancelTSActivityInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        CancelTSActivityInstanceResponse self = new CancelTSActivityInstanceResponse();
        return TeaModel.build(map, self);
    }

    public CancelTSActivityInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CancelTSActivityInstanceResponse setBody(CancelTSActivityInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public CancelTSActivityInstanceResponseBody getBody() {
        return this.body;
    }

}
