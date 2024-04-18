// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oos20190601.models;

import com.aliyun.tea.*;

public class GetInventorySchemaResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetInventorySchemaResponseBody body;

    public static GetInventorySchemaResponse build(java.util.Map<String, ?> map) throws Exception {
        GetInventorySchemaResponse self = new GetInventorySchemaResponse();
        return TeaModel.build(map, self);
    }

    public GetInventorySchemaResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetInventorySchemaResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetInventorySchemaResponse setBody(GetInventorySchemaResponseBody body) {
        this.body = body;
        return this;
    }
    public GetInventorySchemaResponseBody getBody() {
        return this.body;
    }

}
