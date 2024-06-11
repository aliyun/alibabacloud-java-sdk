// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ram20150501.models;

import com.aliyun.tea.*;

public class AttachPolicyToRoleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AttachPolicyToRoleResponseBody body;

    public static AttachPolicyToRoleResponse build(java.util.Map<String, ?> map) throws Exception {
        AttachPolicyToRoleResponse self = new AttachPolicyToRoleResponse();
        return TeaModel.build(map, self);
    }

    public AttachPolicyToRoleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AttachPolicyToRoleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AttachPolicyToRoleResponse setBody(AttachPolicyToRoleResponseBody body) {
        this.body = body;
        return this;
    }
    public AttachPolicyToRoleResponseBody getBody() {
        return this.body;
    }

}
