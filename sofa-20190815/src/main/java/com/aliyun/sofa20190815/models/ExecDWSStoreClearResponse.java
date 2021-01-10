// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ExecDWSStoreClearResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ExecDWSStoreClearResponseBody body;

    public static ExecDWSStoreClearResponse build(java.util.Map<String, ?> map) throws Exception {
        ExecDWSStoreClearResponse self = new ExecDWSStoreClearResponse();
        return TeaModel.build(map, self);
    }

    public ExecDWSStoreClearResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ExecDWSStoreClearResponse setBody(ExecDWSStoreClearResponseBody body) {
        this.body = body;
        return this;
    }
    public ExecDWSStoreClearResponseBody getBody() {
        return this.body;
    }

}
