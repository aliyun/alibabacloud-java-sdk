// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rdsai20250507.models;

import com.aliyun.tea.*;

public class ListContextDatabaseSyncPluginsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListContextDatabaseSyncPluginsResponseBody body;

    public static ListContextDatabaseSyncPluginsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListContextDatabaseSyncPluginsResponse self = new ListContextDatabaseSyncPluginsResponse();
        return TeaModel.build(map, self);
    }

    public ListContextDatabaseSyncPluginsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListContextDatabaseSyncPluginsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListContextDatabaseSyncPluginsResponse setBody(ListContextDatabaseSyncPluginsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListContextDatabaseSyncPluginsResponseBody getBody() {
        return this.body;
    }

}
