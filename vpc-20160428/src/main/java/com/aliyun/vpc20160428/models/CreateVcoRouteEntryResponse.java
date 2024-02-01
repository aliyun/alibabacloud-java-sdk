// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class CreateVcoRouteEntryResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateVcoRouteEntryResponseBody body;

    public static CreateVcoRouteEntryResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateVcoRouteEntryResponse self = new CreateVcoRouteEntryResponse();
        return TeaModel.build(map, self);
    }

    public CreateVcoRouteEntryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateVcoRouteEntryResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateVcoRouteEntryResponse setBody(CreateVcoRouteEntryResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateVcoRouteEntryResponseBody getBody() {
        return this.body;
    }

}
