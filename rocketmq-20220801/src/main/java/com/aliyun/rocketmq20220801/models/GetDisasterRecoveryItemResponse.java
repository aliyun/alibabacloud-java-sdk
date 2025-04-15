// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rocketmq20220801.models;

import com.aliyun.tea.*;

public class GetDisasterRecoveryItemResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetDisasterRecoveryItemResponseBody body;

    public static GetDisasterRecoveryItemResponse build(java.util.Map<String, ?> map) throws Exception {
        GetDisasterRecoveryItemResponse self = new GetDisasterRecoveryItemResponse();
        return TeaModel.build(map, self);
    }

    public GetDisasterRecoveryItemResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetDisasterRecoveryItemResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetDisasterRecoveryItemResponse setBody(GetDisasterRecoveryItemResponseBody body) {
        this.body = body;
        return this;
    }
    public GetDisasterRecoveryItemResponseBody getBody() {
        return this.body;
    }

}
