// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ExecHasApprovalNwforwardResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ExecHasApprovalNwforwardResponseBody body;

    public static ExecHasApprovalNwforwardResponse build(java.util.Map<String, ?> map) throws Exception {
        ExecHasApprovalNwforwardResponse self = new ExecHasApprovalNwforwardResponse();
        return TeaModel.build(map, self);
    }

    public ExecHasApprovalNwforwardResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ExecHasApprovalNwforwardResponse setBody(ExecHasApprovalNwforwardResponseBody body) {
        this.body = body;
        return this;
    }
    public ExecHasApprovalNwforwardResponseBody getBody() {
        return this.body;
    }

}
