// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class UpdateODPSchemasConnPropsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateODPSchemasConnPropsResponseBody body;

    public static UpdateODPSchemasConnPropsResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateODPSchemasConnPropsResponse self = new UpdateODPSchemasConnPropsResponse();
        return TeaModel.build(map, self);
    }

    public UpdateODPSchemasConnPropsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateODPSchemasConnPropsResponse setBody(UpdateODPSchemasConnPropsResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateODPSchemasConnPropsResponseBody getBody() {
        return this.body;
    }

}
