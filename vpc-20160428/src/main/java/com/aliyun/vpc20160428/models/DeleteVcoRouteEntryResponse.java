// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DeleteVcoRouteEntryResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteVcoRouteEntryResponseBody body;

    public static DeleteVcoRouteEntryResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteVcoRouteEntryResponse self = new DeleteVcoRouteEntryResponse();
        return TeaModel.build(map, self);
    }

    public DeleteVcoRouteEntryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteVcoRouteEntryResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteVcoRouteEntryResponse setBody(DeleteVcoRouteEntryResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteVcoRouteEntryResponseBody getBody() {
        return this.body;
    }

}
