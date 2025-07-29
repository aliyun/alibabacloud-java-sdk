// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.schedulerx220190430.models;

import com.aliyun.tea.*;

public class ManageSchedulerxJobSyncResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ManageSchedulerxJobSyncResponseBody body;

    public static ManageSchedulerxJobSyncResponse build(java.util.Map<String, ?> map) throws Exception {
        ManageSchedulerxJobSyncResponse self = new ManageSchedulerxJobSyncResponse();
        return TeaModel.build(map, self);
    }

    public ManageSchedulerxJobSyncResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ManageSchedulerxJobSyncResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ManageSchedulerxJobSyncResponse setBody(ManageSchedulerxJobSyncResponseBody body) {
        this.body = body;
        return this;
    }
    public ManageSchedulerxJobSyncResponseBody getBody() {
        return this.body;
    }

}
