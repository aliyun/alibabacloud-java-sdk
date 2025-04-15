// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rocketmq20220801.models;

import com.aliyun.tea.*;

public class UpdateDisasterRecoveryItemResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateDisasterRecoveryItemResponseBody body;

    public static UpdateDisasterRecoveryItemResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateDisasterRecoveryItemResponse self = new UpdateDisasterRecoveryItemResponse();
        return TeaModel.build(map, self);
    }

    public UpdateDisasterRecoveryItemResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateDisasterRecoveryItemResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateDisasterRecoveryItemResponse setBody(UpdateDisasterRecoveryItemResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateDisasterRecoveryItemResponseBody getBody() {
        return this.body;
    }

}
