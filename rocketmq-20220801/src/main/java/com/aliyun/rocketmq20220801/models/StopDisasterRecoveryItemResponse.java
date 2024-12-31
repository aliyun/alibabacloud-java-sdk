// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rocketmq20220801.models;

import com.aliyun.tea.*;

public class StopDisasterRecoveryItemResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public StopDisasterRecoveryItemResponseBody body;

    public static StopDisasterRecoveryItemResponse build(java.util.Map<String, ?> map) throws Exception {
        StopDisasterRecoveryItemResponse self = new StopDisasterRecoveryItemResponse();
        return TeaModel.build(map, self);
    }

    public StopDisasterRecoveryItemResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public StopDisasterRecoveryItemResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public StopDisasterRecoveryItemResponse setBody(StopDisasterRecoveryItemResponseBody body) {
        this.body = body;
        return this;
    }
    public StopDisasterRecoveryItemResponseBody getBody() {
        return this.body;
    }

}
