// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class CreateGlobalDataNetworkResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateGlobalDataNetworkResponseBody body;

    public static CreateGlobalDataNetworkResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateGlobalDataNetworkResponse self = new CreateGlobalDataNetworkResponse();
        return TeaModel.build(map, self);
    }

    public CreateGlobalDataNetworkResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateGlobalDataNetworkResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateGlobalDataNetworkResponse setBody(CreateGlobalDataNetworkResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateGlobalDataNetworkResponseBody getBody() {
        return this.body;
    }

}
