// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ExecHasInspectUnbindmissionResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ExecHasInspectUnbindmissionResponseBody body;

    public static ExecHasInspectUnbindmissionResponse build(java.util.Map<String, ?> map) throws Exception {
        ExecHasInspectUnbindmissionResponse self = new ExecHasInspectUnbindmissionResponse();
        return TeaModel.build(map, self);
    }

    public ExecHasInspectUnbindmissionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ExecHasInspectUnbindmissionResponse setBody(ExecHasInspectUnbindmissionResponseBody body) {
        this.body = body;
        return this;
    }
    public ExecHasInspectUnbindmissionResponseBody getBody() {
        return this.body;
    }

}
