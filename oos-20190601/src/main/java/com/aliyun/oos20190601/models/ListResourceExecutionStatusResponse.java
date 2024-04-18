// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oos20190601.models;

import com.aliyun.tea.*;

public class ListResourceExecutionStatusResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListResourceExecutionStatusResponseBody body;

    public static ListResourceExecutionStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        ListResourceExecutionStatusResponse self = new ListResourceExecutionStatusResponse();
        return TeaModel.build(map, self);
    }

    public ListResourceExecutionStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListResourceExecutionStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListResourceExecutionStatusResponse setBody(ListResourceExecutionStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public ListResourceExecutionStatusResponseBody getBody() {
        return this.body;
    }

}
