// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DeleteGlobalDataNetworkResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteGlobalDataNetworkResponseBody body;

    public static DeleteGlobalDataNetworkResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteGlobalDataNetworkResponse self = new DeleteGlobalDataNetworkResponse();
        return TeaModel.build(map, self);
    }

    public DeleteGlobalDataNetworkResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteGlobalDataNetworkResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteGlobalDataNetworkResponse setBody(DeleteGlobalDataNetworkResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteGlobalDataNetworkResponseBody getBody() {
        return this.body;
    }

}
