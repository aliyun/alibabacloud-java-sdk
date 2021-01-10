// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ExecHasInspectSaveshellcodeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ExecHasInspectSaveshellcodeResponseBody body;

    public static ExecHasInspectSaveshellcodeResponse build(java.util.Map<String, ?> map) throws Exception {
        ExecHasInspectSaveshellcodeResponse self = new ExecHasInspectSaveshellcodeResponse();
        return TeaModel.build(map, self);
    }

    public ExecHasInspectSaveshellcodeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ExecHasInspectSaveshellcodeResponse setBody(ExecHasInspectSaveshellcodeResponseBody body) {
        this.body = body;
        return this;
    }
    public ExecHasInspectSaveshellcodeResponseBody getBody() {
        return this.body;
    }

}
