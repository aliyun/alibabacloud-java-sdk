// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yike20260319.models;

import com.aliyun.tea.*;

public class SetYikeUserRoleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SetYikeUserRoleResponseBody body;

    public static SetYikeUserRoleResponse build(java.util.Map<String, ?> map) throws Exception {
        SetYikeUserRoleResponse self = new SetYikeUserRoleResponse();
        return TeaModel.build(map, self);
    }

    public SetYikeUserRoleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SetYikeUserRoleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SetYikeUserRoleResponse setBody(SetYikeUserRoleResponseBody body) {
        this.body = body;
        return this;
    }
    public SetYikeUserRoleResponseBody getBody() {
        return this.body;
    }

}
