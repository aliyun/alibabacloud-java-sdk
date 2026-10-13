// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rdsai20250507.models;

import com.aliyun.tea.*;

public class ListContextDatabaseSyncJobDocumentsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListContextDatabaseSyncJobDocumentsResponseBody body;

    public static ListContextDatabaseSyncJobDocumentsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListContextDatabaseSyncJobDocumentsResponse self = new ListContextDatabaseSyncJobDocumentsResponse();
        return TeaModel.build(map, self);
    }

    public ListContextDatabaseSyncJobDocumentsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListContextDatabaseSyncJobDocumentsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListContextDatabaseSyncJobDocumentsResponse setBody(ListContextDatabaseSyncJobDocumentsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListContextDatabaseSyncJobDocumentsResponseBody getBody() {
        return this.body;
    }

}
