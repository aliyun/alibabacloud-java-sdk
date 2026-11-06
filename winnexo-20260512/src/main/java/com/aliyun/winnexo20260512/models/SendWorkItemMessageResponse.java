// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class SendWorkItemMessageResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SendWorkItemMessageResponseBody body;

    public static SendWorkItemMessageResponse build(java.util.Map<String, ?> map) throws Exception {
        SendWorkItemMessageResponse self = new SendWorkItemMessageResponse();
        return TeaModel.build(map, self);
    }

    public SendWorkItemMessageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SendWorkItemMessageResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SendWorkItemMessageResponse setBody(SendWorkItemMessageResponseBody body) {
        this.body = body;
        return this;
    }
    public SendWorkItemMessageResponseBody getBody() {
        return this.body;
    }

}
