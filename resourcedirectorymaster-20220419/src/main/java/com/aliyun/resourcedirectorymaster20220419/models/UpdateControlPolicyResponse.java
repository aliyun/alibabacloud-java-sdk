// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcedirectorymaster20220419.models;

import com.aliyun.tea.*;

public class UpdateControlPolicyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateControlPolicyResponseBody body;

    public static UpdateControlPolicyResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateControlPolicyResponse self = new UpdateControlPolicyResponse();
        return TeaModel.build(map, self);
    }

    public UpdateControlPolicyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateControlPolicyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateControlPolicyResponse setBody(UpdateControlPolicyResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateControlPolicyResponseBody getBody() {
        return this.body;
    }

}
