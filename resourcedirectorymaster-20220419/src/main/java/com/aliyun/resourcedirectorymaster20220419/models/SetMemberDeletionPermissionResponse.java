// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcedirectorymaster20220419.models;

import com.aliyun.tea.*;

public class SetMemberDeletionPermissionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SetMemberDeletionPermissionResponseBody body;

    public static SetMemberDeletionPermissionResponse build(java.util.Map<String, ?> map) throws Exception {
        SetMemberDeletionPermissionResponse self = new SetMemberDeletionPermissionResponse();
        return TeaModel.build(map, self);
    }

    public SetMemberDeletionPermissionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SetMemberDeletionPermissionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SetMemberDeletionPermissionResponse setBody(SetMemberDeletionPermissionResponseBody body) {
        this.body = body;
        return this;
    }
    public SetMemberDeletionPermissionResponseBody getBody() {
        return this.body;
    }

}
