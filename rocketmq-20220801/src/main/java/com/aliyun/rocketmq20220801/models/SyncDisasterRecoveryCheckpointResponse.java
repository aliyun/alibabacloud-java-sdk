// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rocketmq20220801.models;

import com.aliyun.tea.*;

public class SyncDisasterRecoveryCheckpointResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SyncDisasterRecoveryCheckpointResponseBody body;

    public static SyncDisasterRecoveryCheckpointResponse build(java.util.Map<String, ?> map) throws Exception {
        SyncDisasterRecoveryCheckpointResponse self = new SyncDisasterRecoveryCheckpointResponse();
        return TeaModel.build(map, self);
    }

    public SyncDisasterRecoveryCheckpointResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SyncDisasterRecoveryCheckpointResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SyncDisasterRecoveryCheckpointResponse setBody(SyncDisasterRecoveryCheckpointResponseBody body) {
        this.body = body;
        return this;
    }
    public SyncDisasterRecoveryCheckpointResponseBody getBody() {
        return this.body;
    }

}
