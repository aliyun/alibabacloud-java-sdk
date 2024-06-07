// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class ListTrafficControlTargetTrafficHistoryResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListTrafficControlTargetTrafficHistoryResponseBody body;

    public static ListTrafficControlTargetTrafficHistoryResponse build(java.util.Map<String, ?> map) throws Exception {
        ListTrafficControlTargetTrafficHistoryResponse self = new ListTrafficControlTargetTrafficHistoryResponse();
        return TeaModel.build(map, self);
    }

    public ListTrafficControlTargetTrafficHistoryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListTrafficControlTargetTrafficHistoryResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListTrafficControlTargetTrafficHistoryResponse setBody(ListTrafficControlTargetTrafficHistoryResponseBody body) {
        this.body = body;
        return this;
    }
    public ListTrafficControlTargetTrafficHistoryResponseBody getBody() {
        return this.body;
    }

}
