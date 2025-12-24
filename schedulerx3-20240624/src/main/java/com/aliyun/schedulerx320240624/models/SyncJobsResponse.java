// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.schedulerx320240624.models;

import com.aliyun.tea.*;

public class SyncJobsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SyncJobsResponseBody body;

    public static SyncJobsResponse build(java.util.Map<String, ?> map) throws Exception {
        SyncJobsResponse self = new SyncJobsResponse();
        return TeaModel.build(map, self);
    }

    public SyncJobsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SyncJobsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SyncJobsResponse setBody(SyncJobsResponseBody body) {
        this.body = body;
        return this;
    }
    public SyncJobsResponseBody getBody() {
        return this.body;
    }

}
