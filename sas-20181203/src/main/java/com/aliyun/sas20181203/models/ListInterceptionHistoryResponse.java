// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ListInterceptionHistoryResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListInterceptionHistoryResponseBody body;

    public static ListInterceptionHistoryResponse build(java.util.Map<String, ?> map) throws Exception {
        ListInterceptionHistoryResponse self = new ListInterceptionHistoryResponse();
        return TeaModel.build(map, self);
    }

    public ListInterceptionHistoryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListInterceptionHistoryResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListInterceptionHistoryResponse setBody(ListInterceptionHistoryResponseBody body) {
        this.body = body;
        return this;
    }
    public ListInterceptionHistoryResponseBody getBody() {
        return this.body;
    }

}
