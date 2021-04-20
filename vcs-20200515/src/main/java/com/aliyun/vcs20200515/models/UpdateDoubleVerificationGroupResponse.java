// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class UpdateDoubleVerificationGroupResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateDoubleVerificationGroupResponseBody body;

    public static UpdateDoubleVerificationGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateDoubleVerificationGroupResponse self = new UpdateDoubleVerificationGroupResponse();
        return TeaModel.build(map, self);
    }

    public UpdateDoubleVerificationGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateDoubleVerificationGroupResponse setBody(UpdateDoubleVerificationGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateDoubleVerificationGroupResponseBody getBody() {
        return this.body;
    }

}
