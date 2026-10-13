// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rdsai20250507.models;

import com.aliyun.tea.*;

public class AddContextDatabaseSyncJobExclusionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AddContextDatabaseSyncJobExclusionResponseBody body;

    public static AddContextDatabaseSyncJobExclusionResponse build(java.util.Map<String, ?> map) throws Exception {
        AddContextDatabaseSyncJobExclusionResponse self = new AddContextDatabaseSyncJobExclusionResponse();
        return TeaModel.build(map, self);
    }

    public AddContextDatabaseSyncJobExclusionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddContextDatabaseSyncJobExclusionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AddContextDatabaseSyncJobExclusionResponse setBody(AddContextDatabaseSyncJobExclusionResponseBody body) {
        this.body = body;
        return this;
    }
    public AddContextDatabaseSyncJobExclusionResponseBody getBody() {
        return this.body;
    }

}
