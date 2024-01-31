// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DeletePrivateRegistryResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeletePrivateRegistryResponseBody body;

    public static DeletePrivateRegistryResponse build(java.util.Map<String, ?> map) throws Exception {
        DeletePrivateRegistryResponse self = new DeletePrivateRegistryResponse();
        return TeaModel.build(map, self);
    }

    public DeletePrivateRegistryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeletePrivateRegistryResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeletePrivateRegistryResponse setBody(DeletePrivateRegistryResponseBody body) {
        this.body = body;
        return this;
    }
    public DeletePrivateRegistryResponseBody getBody() {
        return this.body;
    }

}
