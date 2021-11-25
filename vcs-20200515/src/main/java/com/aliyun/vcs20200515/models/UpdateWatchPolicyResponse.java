// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class UpdateWatchPolicyResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateWatchPolicyResponseBody body;

    public static UpdateWatchPolicyResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateWatchPolicyResponse self = new UpdateWatchPolicyResponse();
        return TeaModel.build(map, self);
    }

    public UpdateWatchPolicyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateWatchPolicyResponse setBody(UpdateWatchPolicyResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateWatchPolicyResponseBody getBody() {
        return this.body;
    }

}
