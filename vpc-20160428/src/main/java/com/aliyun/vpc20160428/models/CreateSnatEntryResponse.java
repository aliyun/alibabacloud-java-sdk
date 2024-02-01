// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class CreateSnatEntryResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateSnatEntryResponseBody body;

    public static CreateSnatEntryResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateSnatEntryResponse self = new CreateSnatEntryResponse();
        return TeaModel.build(map, self);
    }

    public CreateSnatEntryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateSnatEntryResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateSnatEntryResponse setBody(CreateSnatEntryResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateSnatEntryResponseBody getBody() {
        return this.body;
    }

}
