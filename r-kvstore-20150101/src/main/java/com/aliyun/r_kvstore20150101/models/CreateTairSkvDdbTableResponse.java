// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.r_kvstore20150101.models;

import com.aliyun.tea.*;

public class CreateTairSkvDdbTableResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateTairSkvDdbTableResponseBody body;

    public static CreateTairSkvDdbTableResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateTairSkvDdbTableResponse self = new CreateTairSkvDdbTableResponse();
        return TeaModel.build(map, self);
    }

    public CreateTairSkvDdbTableResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateTairSkvDdbTableResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateTairSkvDdbTableResponse setBody(CreateTairSkvDdbTableResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateTairSkvDdbTableResponseBody getBody() {
        return this.body;
    }

}
