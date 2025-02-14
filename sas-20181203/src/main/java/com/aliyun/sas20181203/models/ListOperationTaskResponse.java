// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ListOperationTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListOperationTaskResponseBody body;

    public static ListOperationTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        ListOperationTaskResponse self = new ListOperationTaskResponse();
        return TeaModel.build(map, self);
    }

    public ListOperationTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListOperationTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListOperationTaskResponse setBody(ListOperationTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public ListOperationTaskResponseBody getBody() {
        return this.body;
    }

}
