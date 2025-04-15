// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rocketmq20220801.models;

import com.aliyun.tea.*;

public class ListDisasterRecoveryItemsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListDisasterRecoveryItemsResponseBody body;

    public static ListDisasterRecoveryItemsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListDisasterRecoveryItemsResponse self = new ListDisasterRecoveryItemsResponse();
        return TeaModel.build(map, self);
    }

    public ListDisasterRecoveryItemsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListDisasterRecoveryItemsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListDisasterRecoveryItemsResponse setBody(ListDisasterRecoveryItemsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListDisasterRecoveryItemsResponseBody getBody() {
        return this.body;
    }

}
