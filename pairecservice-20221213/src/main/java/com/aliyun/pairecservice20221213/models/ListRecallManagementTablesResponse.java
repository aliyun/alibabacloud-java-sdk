// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class ListRecallManagementTablesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListRecallManagementTablesResponseBody body;

    public static ListRecallManagementTablesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListRecallManagementTablesResponse self = new ListRecallManagementTablesResponse();
        return TeaModel.build(map, self);
    }

    public ListRecallManagementTablesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListRecallManagementTablesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListRecallManagementTablesResponse setBody(ListRecallManagementTablesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListRecallManagementTablesResponseBody getBody() {
        return this.body;
    }

}
