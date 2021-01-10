// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ExecHasInspectRebindallruleResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ExecHasInspectRebindallruleResponseBody body;

    public static ExecHasInspectRebindallruleResponse build(java.util.Map<String, ?> map) throws Exception {
        ExecHasInspectRebindallruleResponse self = new ExecHasInspectRebindallruleResponse();
        return TeaModel.build(map, self);
    }

    public ExecHasInspectRebindallruleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ExecHasInspectRebindallruleResponse setBody(ExecHasInspectRebindallruleResponseBody body) {
        this.body = body;
        return this;
    }
    public ExecHasInspectRebindallruleResponseBody getBody() {
        return this.body;
    }

}
