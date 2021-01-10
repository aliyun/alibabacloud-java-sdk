// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class UpdateODPSchemasPhysicalSchemaAuthInfosResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateODPSchemasPhysicalSchemaAuthInfosResponseBody body;

    public static UpdateODPSchemasPhysicalSchemaAuthInfosResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateODPSchemasPhysicalSchemaAuthInfosResponse self = new UpdateODPSchemasPhysicalSchemaAuthInfosResponse();
        return TeaModel.build(map, self);
    }

    public UpdateODPSchemasPhysicalSchemaAuthInfosResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateODPSchemasPhysicalSchemaAuthInfosResponse setBody(UpdateODPSchemasPhysicalSchemaAuthInfosResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateODPSchemasPhysicalSchemaAuthInfosResponseBody getBody() {
        return this.body;
    }

}
