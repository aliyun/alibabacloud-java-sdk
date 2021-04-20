// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class DeleteDoubleVerificationGroupResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteDoubleVerificationGroupResponseBody body;

    public static DeleteDoubleVerificationGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteDoubleVerificationGroupResponse self = new DeleteDoubleVerificationGroupResponse();
        return TeaModel.build(map, self);
    }

    public DeleteDoubleVerificationGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteDoubleVerificationGroupResponse setBody(DeleteDoubleVerificationGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteDoubleVerificationGroupResponseBody getBody() {
        return this.body;
    }

}
