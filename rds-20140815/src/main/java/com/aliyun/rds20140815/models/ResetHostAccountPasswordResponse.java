// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class ResetHostAccountPasswordResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ResetHostAccountPasswordResponseBody body;

    public static ResetHostAccountPasswordResponse build(java.util.Map<String, ?> map) throws Exception {
        ResetHostAccountPasswordResponse self = new ResetHostAccountPasswordResponse();
        return TeaModel.build(map, self);
    }

    public ResetHostAccountPasswordResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ResetHostAccountPasswordResponse setBody(ResetHostAccountPasswordResponseBody body) {
        this.body = body;
        return this;
    }
    public ResetHostAccountPasswordResponseBody getBody() {
        return this.body;
    }

}
