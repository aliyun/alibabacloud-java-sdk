// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class DeleteUserGroupMembersResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteUserGroupMembersResponseBody body;

    public static DeleteUserGroupMembersResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteUserGroupMembersResponse self = new DeleteUserGroupMembersResponse();
        return TeaModel.build(map, self);
    }

    public DeleteUserGroupMembersResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteUserGroupMembersResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteUserGroupMembersResponse setBody(DeleteUserGroupMembersResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteUserGroupMembersResponseBody getBody() {
        return this.body;
    }

}
