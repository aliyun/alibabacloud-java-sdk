// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class DeleteUserGroupMemberResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public DeleteUserGroupMemberResponse setBody(DeleteUserGroupMemberResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteUserGroupMemberResponseBody getBody() {
        return this.body;
    }

}
