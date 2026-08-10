// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rdsai20250507.models;

import com.aliyun.tea.*;

public class CreateContextDatabaseWorkspaceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateContextDatabaseWorkspaceResponseBody body;

    public static CreateContextDatabaseWorkspaceResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateContextDatabaseWorkspaceResponse self = new CreateContextDatabaseWorkspaceResponse();
        return TeaModel.build(map, self);
    }

    public CreateContextDatabaseWorkspaceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateContextDatabaseWorkspaceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateContextDatabaseWorkspaceResponse setBody(CreateContextDatabaseWorkspaceResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateContextDatabaseWorkspaceResponseBody getBody() {
        return this.body;
    }

}
