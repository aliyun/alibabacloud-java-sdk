// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class AddWorkspaceUsersResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public AddWorkspaceUsersResponseBody body;

    public static AddWorkspaceUsersResponse build(java.util.Map<String, ?> map) throws Exception {
        AddWorkspaceUsersResponse self = new AddWorkspaceUsersResponse();
        return TeaModel.build(map, self);
    }

    public AddWorkspaceUsersResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddWorkspaceUsersResponse setBody(AddWorkspaceUsersResponseBody body) {
        this.body = body;
        return this;
    }
    public AddWorkspaceUsersResponseBody getBody() {
        return this.body;
    }

}
