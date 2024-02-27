// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class AddUserToWorkspaceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AddUserToWorkspaceResponseBody body;

    public static AddUserToWorkspaceResponse build(java.util.Map<String, ?> map) throws Exception {
        AddUserToWorkspaceResponse self = new AddUserToWorkspaceResponse();
        return TeaModel.build(map, self);
    }

    public AddUserToWorkspaceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddUserToWorkspaceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AddUserToWorkspaceResponse setBody(AddUserToWorkspaceResponseBody body) {
        this.body = body;
        return this;
    }
    public AddUserToWorkspaceResponseBody getBody() {
        return this.body;
    }

}
