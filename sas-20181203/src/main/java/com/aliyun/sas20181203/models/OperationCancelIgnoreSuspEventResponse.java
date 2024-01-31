// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class OperationCancelIgnoreSuspEventResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public OperationCancelIgnoreSuspEventResponseBody body;

    public static OperationCancelIgnoreSuspEventResponse build(java.util.Map<String, ?> map) throws Exception {
        OperationCancelIgnoreSuspEventResponse self = new OperationCancelIgnoreSuspEventResponse();
        return TeaModel.build(map, self);
    }

    public OperationCancelIgnoreSuspEventResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public OperationCancelIgnoreSuspEventResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public OperationCancelIgnoreSuspEventResponse setBody(OperationCancelIgnoreSuspEventResponseBody body) {
        this.body = body;
        return this;
    }
    public OperationCancelIgnoreSuspEventResponseBody getBody() {
        return this.body;
    }

}
