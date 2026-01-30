// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class ListInstanceResourceTablesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListInstanceResourceTablesResponseBody body;

    public static ListInstanceResourceTablesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListInstanceResourceTablesResponse self = new ListInstanceResourceTablesResponse();
        return TeaModel.build(map, self);
    }

    public ListInstanceResourceTablesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListInstanceResourceTablesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListInstanceResourceTablesResponse setBody(ListInstanceResourceTablesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListInstanceResourceTablesResponseBody getBody() {
        return this.body;
    }

}
