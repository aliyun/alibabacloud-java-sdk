// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rocketmq20220801.models;

import com.aliyun.tea.*;

public class DeleteDisasterRecoveryItemResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteDisasterRecoveryItemResponseBody body;

    public static DeleteDisasterRecoveryItemResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteDisasterRecoveryItemResponse self = new DeleteDisasterRecoveryItemResponse();
        return TeaModel.build(map, self);
    }

    public DeleteDisasterRecoveryItemResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteDisasterRecoveryItemResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteDisasterRecoveryItemResponse setBody(DeleteDisasterRecoveryItemResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteDisasterRecoveryItemResponseBody getBody() {
        return this.body;
    }

}
