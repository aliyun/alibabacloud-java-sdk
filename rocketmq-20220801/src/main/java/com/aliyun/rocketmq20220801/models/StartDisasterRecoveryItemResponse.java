// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rocketmq20220801.models;

import com.aliyun.tea.*;

public class StartDisasterRecoveryItemResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public StartDisasterRecoveryItemResponseBody body;

    public static StartDisasterRecoveryItemResponse build(java.util.Map<String, ?> map) throws Exception {
        StartDisasterRecoveryItemResponse self = new StartDisasterRecoveryItemResponse();
        return TeaModel.build(map, self);
    }

    public StartDisasterRecoveryItemResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public StartDisasterRecoveryItemResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public StartDisasterRecoveryItemResponse setBody(StartDisasterRecoveryItemResponseBody body) {
        this.body = body;
        return this;
    }
    public StartDisasterRecoveryItemResponseBody getBody() {
        return this.body;
    }

}
