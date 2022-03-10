// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class AddUserGroupMemberResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public AddUserGroupMemberResponseBody body;

    public static AddUserGroupMemberResponse build(java.util.Map<String, ?> map) throws Exception {
        AddUserGroupMemberResponse self = new AddUserGroupMemberResponse();
        return TeaModel.build(map, self);
    }

    public AddUserGroupMemberResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddUserGroupMemberResponse setBody(AddUserGroupMemberResponseBody body) {
        this.body = body;
        return this;
    }
    public AddUserGroupMemberResponseBody getBody() {
        return this.body;
    }

}
