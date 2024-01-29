// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcemanager20200331.models;

import com.aliyun.tea.*;

public class AttachPolicyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AttachPolicyResponseBody body;

    public static AttachPolicyResponse build(java.util.Map<String, ?> map) throws Exception {
        AttachPolicyResponse self = new AttachPolicyResponse();
        return TeaModel.build(map, self);
    }

    public AttachPolicyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AttachPolicyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AttachPolicyResponse setBody(AttachPolicyResponseBody body) {
        this.body = body;
        return this;
    }
    public AttachPolicyResponseBody getBody() {
        return this.body;
    }

}
