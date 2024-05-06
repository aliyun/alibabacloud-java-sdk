// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcedirectorymaster20220419.models;

import com.aliyun.tea.*;

public class AddMessageContactResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AddMessageContactResponseBody body;

    public static AddMessageContactResponse build(java.util.Map<String, ?> map) throws Exception {
        AddMessageContactResponse self = new AddMessageContactResponse();
        return TeaModel.build(map, self);
    }

    public AddMessageContactResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddMessageContactResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AddMessageContactResponse setBody(AddMessageContactResponseBody body) {
        this.body = body;
        return this;
    }
    public AddMessageContactResponseBody getBody() {
        return this.body;
    }

}
