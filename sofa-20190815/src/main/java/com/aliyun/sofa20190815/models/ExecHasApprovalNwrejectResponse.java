// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ExecHasApprovalNwrejectResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ExecHasApprovalNwrejectResponseBody body;

    public static ExecHasApprovalNwrejectResponse build(java.util.Map<String, ?> map) throws Exception {
        ExecHasApprovalNwrejectResponse self = new ExecHasApprovalNwrejectResponse();
        return TeaModel.build(map, self);
    }

    public ExecHasApprovalNwrejectResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ExecHasApprovalNwrejectResponse setBody(ExecHasApprovalNwrejectResponseBody body) {
        this.body = body;
        return this;
    }
    public ExecHasApprovalNwrejectResponseBody getBody() {
        return this.body;
    }

}
