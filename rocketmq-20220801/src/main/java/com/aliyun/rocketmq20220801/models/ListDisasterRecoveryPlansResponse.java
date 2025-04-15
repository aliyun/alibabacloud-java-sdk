// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rocketmq20220801.models;

import com.aliyun.tea.*;

public class ListDisasterRecoveryPlansResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListDisasterRecoveryPlansResponseBody body;

    public static ListDisasterRecoveryPlansResponse build(java.util.Map<String, ?> map) throws Exception {
        ListDisasterRecoveryPlansResponse self = new ListDisasterRecoveryPlansResponse();
        return TeaModel.build(map, self);
    }

    public ListDisasterRecoveryPlansResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListDisasterRecoveryPlansResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListDisasterRecoveryPlansResponse setBody(ListDisasterRecoveryPlansResponseBody body) {
        this.body = body;
        return this;
    }
    public ListDisasterRecoveryPlansResponseBody getBody() {
        return this.body;
    }

}
