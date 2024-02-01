// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class CreateFullNatEntryResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateFullNatEntryResponseBody body;

    public static CreateFullNatEntryResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateFullNatEntryResponse self = new CreateFullNatEntryResponse();
        return TeaModel.build(map, self);
    }

    public CreateFullNatEntryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateFullNatEntryResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateFullNatEntryResponse setBody(CreateFullNatEntryResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateFullNatEntryResponseBody getBody() {
        return this.body;
    }

}
