// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ram20150501.models;

import com.aliyun.tea.*;

public class AttachPolicyToUserResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AttachPolicyToUserResponseBody body;

    public static AttachPolicyToUserResponse build(java.util.Map<String, ?> map) throws Exception {
        AttachPolicyToUserResponse self = new AttachPolicyToUserResponse();
        return TeaModel.build(map, self);
    }

    public AttachPolicyToUserResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AttachPolicyToUserResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AttachPolicyToUserResponse setBody(AttachPolicyToUserResponseBody body) {
        this.body = body;
        return this;
    }
    public AttachPolicyToUserResponseBody getBody() {
        return this.body;
    }

}
