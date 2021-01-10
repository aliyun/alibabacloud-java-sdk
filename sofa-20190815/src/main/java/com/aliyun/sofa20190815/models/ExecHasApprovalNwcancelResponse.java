// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ExecHasApprovalNwcancelResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ExecHasApprovalNwcancelResponseBody body;

    public static ExecHasApprovalNwcancelResponse build(java.util.Map<String, ?> map) throws Exception {
        ExecHasApprovalNwcancelResponse self = new ExecHasApprovalNwcancelResponse();
        return TeaModel.build(map, self);
    }

    public ExecHasApprovalNwcancelResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ExecHasApprovalNwcancelResponse setBody(ExecHasApprovalNwcancelResponseBody body) {
        this.body = body;
        return this;
    }
    public ExecHasApprovalNwcancelResponseBody getBody() {
        return this.body;
    }

}
