// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oos20190601.models;

import com.aliyun.tea.*;

public class ListTaskExecutionInvocationsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListTaskExecutionInvocationsResponseBody body;

    public static ListTaskExecutionInvocationsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListTaskExecutionInvocationsResponse self = new ListTaskExecutionInvocationsResponse();
        return TeaModel.build(map, self);
    }

    public ListTaskExecutionInvocationsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListTaskExecutionInvocationsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListTaskExecutionInvocationsResponse setBody(ListTaskExecutionInvocationsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListTaskExecutionInvocationsResponseBody getBody() {
        return this.body;
    }

}
