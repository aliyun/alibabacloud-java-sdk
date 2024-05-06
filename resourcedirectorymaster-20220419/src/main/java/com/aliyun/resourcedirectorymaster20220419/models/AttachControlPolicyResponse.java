// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcedirectorymaster20220419.models;

import com.aliyun.tea.*;

public class AttachControlPolicyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AttachControlPolicyResponseBody body;

    public static AttachControlPolicyResponse build(java.util.Map<String, ?> map) throws Exception {
        AttachControlPolicyResponse self = new AttachControlPolicyResponse();
        return TeaModel.build(map, self);
    }

    public AttachControlPolicyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AttachControlPolicyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AttachControlPolicyResponse setBody(AttachControlPolicyResponseBody body) {
        this.body = body;
        return this;
    }
    public AttachControlPolicyResponseBody getBody() {
        return this.body;
    }

}
