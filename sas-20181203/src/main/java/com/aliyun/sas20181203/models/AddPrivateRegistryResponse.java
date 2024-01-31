// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class AddPrivateRegistryResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AddPrivateRegistryResponseBody body;

    public static AddPrivateRegistryResponse build(java.util.Map<String, ?> map) throws Exception {
        AddPrivateRegistryResponse self = new AddPrivateRegistryResponse();
        return TeaModel.build(map, self);
    }

    public AddPrivateRegistryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddPrivateRegistryResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AddPrivateRegistryResponse setBody(AddPrivateRegistryResponseBody body) {
        this.body = body;
        return this;
    }
    public AddPrivateRegistryResponseBody getBody() {
        return this.body;
    }

}
