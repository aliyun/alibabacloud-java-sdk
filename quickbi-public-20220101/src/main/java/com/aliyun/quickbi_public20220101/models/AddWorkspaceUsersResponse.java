// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class AddWorkspaceUsersResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public AddWorkspaceUsersResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AddWorkspaceUsersResponse setBody(AddWorkspaceUsersResponseBody body) {
        this.body = body;
        return this;
    }
    public AddWorkspaceUsersResponseBody getBody() {
        return this.body;
    }

}
