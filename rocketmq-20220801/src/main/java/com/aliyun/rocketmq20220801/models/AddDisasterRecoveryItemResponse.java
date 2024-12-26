// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rocketmq20220801.models;

import com.aliyun.tea.*;

public class AddDisasterRecoveryItemResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AddDisasterRecoveryItemResponseBody body;

    public static AddDisasterRecoveryItemResponse build(java.util.Map<String, ?> map) throws Exception {
        AddDisasterRecoveryItemResponse self = new AddDisasterRecoveryItemResponse();
        return TeaModel.build(map, self);
    }

    public AddDisasterRecoveryItemResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddDisasterRecoveryItemResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AddDisasterRecoveryItemResponse setBody(AddDisasterRecoveryItemResponseBody body) {
        this.body = body;
        return this;
    }
    public AddDisasterRecoveryItemResponseBody getBody() {
        return this.body;
    }

}
