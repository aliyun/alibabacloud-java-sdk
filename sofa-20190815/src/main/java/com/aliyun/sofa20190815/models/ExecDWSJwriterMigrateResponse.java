// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ExecDWSJwriterMigrateResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ExecDWSJwriterMigrateResponseBody body;

    public static ExecDWSJwriterMigrateResponse build(java.util.Map<String, ?> map) throws Exception {
        ExecDWSJwriterMigrateResponse self = new ExecDWSJwriterMigrateResponse();
        return TeaModel.build(map, self);
    }

    public ExecDWSJwriterMigrateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ExecDWSJwriterMigrateResponse setBody(ExecDWSJwriterMigrateResponseBody body) {
        this.body = body;
        return this;
    }
    public ExecDWSJwriterMigrateResponseBody getBody() {
        return this.body;
    }

}
