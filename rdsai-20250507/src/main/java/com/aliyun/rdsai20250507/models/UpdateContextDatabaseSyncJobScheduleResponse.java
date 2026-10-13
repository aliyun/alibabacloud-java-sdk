// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rdsai20250507.models;

import com.aliyun.tea.*;

public class UpdateContextDatabaseSyncJobScheduleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateContextDatabaseSyncJobScheduleResponseBody body;

    public static UpdateContextDatabaseSyncJobScheduleResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateContextDatabaseSyncJobScheduleResponse self = new UpdateContextDatabaseSyncJobScheduleResponse();
        return TeaModel.build(map, self);
    }

    public UpdateContextDatabaseSyncJobScheduleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateContextDatabaseSyncJobScheduleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateContextDatabaseSyncJobScheduleResponse setBody(UpdateContextDatabaseSyncJobScheduleResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateContextDatabaseSyncJobScheduleResponseBody getBody() {
        return this.body;
    }

}
