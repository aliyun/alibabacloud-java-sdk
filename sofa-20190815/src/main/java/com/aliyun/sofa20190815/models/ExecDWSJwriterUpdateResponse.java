// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ExecDWSJwriterUpdateResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ExecDWSJwriterUpdateResponseBody body;

    public static ExecDWSJwriterUpdateResponse build(java.util.Map<String, ?> map) throws Exception {
        ExecDWSJwriterUpdateResponse self = new ExecDWSJwriterUpdateResponse();
        return TeaModel.build(map, self);
    }

    public ExecDWSJwriterUpdateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ExecDWSJwriterUpdateResponse setBody(ExecDWSJwriterUpdateResponseBody body) {
        this.body = body;
        return this;
    }
    public ExecDWSJwriterUpdateResponseBody getBody() {
        return this.body;
    }

}
