// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ram20150501.models;

import com.aliyun.tea.*;

public class DetachPolicyFromRoleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DetachPolicyFromRoleResponseBody body;

    public static DetachPolicyFromRoleResponse build(java.util.Map<String, ?> map) throws Exception {
        DetachPolicyFromRoleResponse self = new DetachPolicyFromRoleResponse();
        return TeaModel.build(map, self);
    }

    public DetachPolicyFromRoleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DetachPolicyFromRoleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DetachPolicyFromRoleResponse setBody(DetachPolicyFromRoleResponseBody body) {
        this.body = body;
        return this;
    }
    public DetachPolicyFromRoleResponseBody getBody() {
        return this.body;
    }

}
