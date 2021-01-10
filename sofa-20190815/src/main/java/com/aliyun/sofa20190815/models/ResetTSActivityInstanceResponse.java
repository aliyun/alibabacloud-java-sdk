// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ResetTSActivityInstanceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ResetTSActivityInstanceResponseBody body;

    public static ResetTSActivityInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        ResetTSActivityInstanceResponse self = new ResetTSActivityInstanceResponse();
        return TeaModel.build(map, self);
    }

    public ResetTSActivityInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ResetTSActivityInstanceResponse setBody(ResetTSActivityInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public ResetTSActivityInstanceResponseBody getBody() {
        return this.body;
    }

}
