// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcedirectorymaster20220419.models;

import com.aliyun.tea.*;

public class GetMessageContactResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetMessageContactResponseBody body;

    public static GetMessageContactResponse build(java.util.Map<String, ?> map) throws Exception {
        GetMessageContactResponse self = new GetMessageContactResponse();
        return TeaModel.build(map, self);
    }

    public GetMessageContactResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetMessageContactResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetMessageContactResponse setBody(GetMessageContactResponseBody body) {
        this.body = body;
        return this;
    }
    public GetMessageContactResponseBody getBody() {
        return this.body;
    }

}
