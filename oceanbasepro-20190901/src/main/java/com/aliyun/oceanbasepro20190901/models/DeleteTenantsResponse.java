// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class DeleteTenantsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteTenantsResponseBody body;

    public static DeleteTenantsResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteTenantsResponse self = new DeleteTenantsResponse();
        return TeaModel.build(map, self);
    }

    public DeleteTenantsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteTenantsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteTenantsResponse setBody(DeleteTenantsResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteTenantsResponseBody getBody() {
        return this.body;
    }

}
