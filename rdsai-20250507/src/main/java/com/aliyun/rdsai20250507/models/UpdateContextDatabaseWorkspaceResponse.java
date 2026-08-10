// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rdsai20250507.models;

import com.aliyun.tea.*;

public class UpdateContextDatabaseWorkspaceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateContextDatabaseWorkspaceResponseBody body;

    public static UpdateContextDatabaseWorkspaceResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateContextDatabaseWorkspaceResponse self = new UpdateContextDatabaseWorkspaceResponse();
        return TeaModel.build(map, self);
    }

    public UpdateContextDatabaseWorkspaceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateContextDatabaseWorkspaceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateContextDatabaseWorkspaceResponse setBody(UpdateContextDatabaseWorkspaceResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateContextDatabaseWorkspaceResponseBody getBody() {
        return this.body;
    }

}
