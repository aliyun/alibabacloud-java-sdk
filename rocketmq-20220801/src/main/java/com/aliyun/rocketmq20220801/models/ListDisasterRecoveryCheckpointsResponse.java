// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rocketmq20220801.models;

import com.aliyun.tea.*;

public class ListDisasterRecoveryCheckpointsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListDisasterRecoveryCheckpointsResponseBody body;

    public static ListDisasterRecoveryCheckpointsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListDisasterRecoveryCheckpointsResponse self = new ListDisasterRecoveryCheckpointsResponse();
        return TeaModel.build(map, self);
    }

    public ListDisasterRecoveryCheckpointsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListDisasterRecoveryCheckpointsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListDisasterRecoveryCheckpointsResponse setBody(ListDisasterRecoveryCheckpointsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListDisasterRecoveryCheckpointsResponseBody getBody() {
        return this.body;
    }

}
