// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DeleteBgpNetworkResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteBgpNetworkResponseBody body;

    public static DeleteBgpNetworkResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteBgpNetworkResponse self = new DeleteBgpNetworkResponse();
        return TeaModel.build(map, self);
    }

    public DeleteBgpNetworkResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteBgpNetworkResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteBgpNetworkResponse setBody(DeleteBgpNetworkResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteBgpNetworkResponseBody getBody() {
        return this.body;
    }

}
