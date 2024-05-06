// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcedirectorymaster20220419.models;

import com.aliyun.tea.*;

public class UpdateMessageContactResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateMessageContactResponseBody body;

    public static UpdateMessageContactResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateMessageContactResponse self = new UpdateMessageContactResponse();
        return TeaModel.build(map, self);
    }

    public UpdateMessageContactResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateMessageContactResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateMessageContactResponse setBody(UpdateMessageContactResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateMessageContactResponseBody getBody() {
        return this.body;
    }

}
