// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rdsai20250507.models;

import com.aliyun.tea.*;

public class DeleteContextDatabaseSyncJobResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteContextDatabaseSyncJobResponseBody body;

    public static DeleteContextDatabaseSyncJobResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteContextDatabaseSyncJobResponse self = new DeleteContextDatabaseSyncJobResponse();
        return TeaModel.build(map, self);
    }

    public DeleteContextDatabaseSyncJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteContextDatabaseSyncJobResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteContextDatabaseSyncJobResponse setBody(DeleteContextDatabaseSyncJobResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteContextDatabaseSyncJobResponseBody getBody() {
        return this.body;
    }

}
