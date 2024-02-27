// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class DeleteUserGroupMemberResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteUserGroupMemberResponseBody body;

    public static DeleteUserGroupMemberResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteUserGroupMemberResponse self = new DeleteUserGroupMemberResponse();
        return TeaModel.build(map, self);
    }

    public DeleteUserGroupMemberResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteUserGroupMemberResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteUserGroupMemberResponse setBody(DeleteUserGroupMemberResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteUserGroupMemberResponseBody getBody() {
        return this.body;
    }

}
