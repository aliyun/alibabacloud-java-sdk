// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rdsai20250507.models;

import com.aliyun.tea.*;

public class DeleteContextDatabaseWorkspaceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteContextDatabaseWorkspaceResponseBody body;

    public static DeleteContextDatabaseWorkspaceResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteContextDatabaseWorkspaceResponse self = new DeleteContextDatabaseWorkspaceResponse();
        return TeaModel.build(map, self);
    }

    public DeleteContextDatabaseWorkspaceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteContextDatabaseWorkspaceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteContextDatabaseWorkspaceResponse setBody(DeleteContextDatabaseWorkspaceResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteContextDatabaseWorkspaceResponseBody getBody() {
        return this.body;
    }

}
