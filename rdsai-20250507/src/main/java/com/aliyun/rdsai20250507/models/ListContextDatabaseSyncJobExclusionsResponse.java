// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rdsai20250507.models;

import com.aliyun.tea.*;

public class ListContextDatabaseSyncJobExclusionsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListContextDatabaseSyncJobExclusionsResponseBody body;

    public static ListContextDatabaseSyncJobExclusionsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListContextDatabaseSyncJobExclusionsResponse self = new ListContextDatabaseSyncJobExclusionsResponse();
        return TeaModel.build(map, self);
    }

    public ListContextDatabaseSyncJobExclusionsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListContextDatabaseSyncJobExclusionsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListContextDatabaseSyncJobExclusionsResponse setBody(ListContextDatabaseSyncJobExclusionsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListContextDatabaseSyncJobExclusionsResponseBody getBody() {
        return this.body;
    }

}
