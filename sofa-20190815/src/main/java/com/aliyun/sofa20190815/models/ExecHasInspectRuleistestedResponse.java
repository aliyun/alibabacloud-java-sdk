// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ExecHasInspectRuleistestedResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ExecHasInspectRuleistestedResponseBody body;

    public static ExecHasInspectRuleistestedResponse build(java.util.Map<String, ?> map) throws Exception {
        ExecHasInspectRuleistestedResponse self = new ExecHasInspectRuleistestedResponse();
        return TeaModel.build(map, self);
    }

    public ExecHasInspectRuleistestedResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ExecHasInspectRuleistestedResponse setBody(ExecHasInspectRuleistestedResponseBody body) {
        this.body = body;
        return this;
    }
    public ExecHasInspectRuleistestedResponseBody getBody() {
        return this.body;
    }

}
