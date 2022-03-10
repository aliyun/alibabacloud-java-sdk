// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class DeleteUserGroupMembersResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public DeleteUserGroupMembersResponse setBody(DeleteUserGroupMembersResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteUserGroupMembersResponseBody getBody() {
        return this.body;
    }

}
