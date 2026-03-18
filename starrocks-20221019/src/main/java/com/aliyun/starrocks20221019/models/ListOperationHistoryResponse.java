// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.starrocks20221019.models;

import com.aliyun.tea.*;

public class ListOperationHistoryResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListOperationHistoryResponseBody body;

    public static ListOperationHistoryResponse build(java.util.Map<String, ?> map) throws Exception {
        ListOperationHistoryResponse self = new ListOperationHistoryResponse();
        return TeaModel.build(map, self);
    }

    public ListOperationHistoryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListOperationHistoryResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListOperationHistoryResponse setBody(ListOperationHistoryResponseBody body) {
        this.body = body;
        return this;
    }
    public ListOperationHistoryResponseBody getBody() {
        return this.body;
    }

}
