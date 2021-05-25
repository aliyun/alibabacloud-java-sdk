// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class GetBuiltinEnvoyFilterCatalogResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetBuiltinEnvoyFilterCatalogResponseBody body;

    public static GetBuiltinEnvoyFilterCatalogResponse build(java.util.Map<String, ?> map) throws Exception {
        GetBuiltinEnvoyFilterCatalogResponse self = new GetBuiltinEnvoyFilterCatalogResponse();
        return TeaModel.build(map, self);
    }

    public GetBuiltinEnvoyFilterCatalogResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetBuiltinEnvoyFilterCatalogResponse setBody(GetBuiltinEnvoyFilterCatalogResponseBody body) {
        this.body = body;
        return this;
    }
    public GetBuiltinEnvoyFilterCatalogResponseBody getBody() {
        return this.body;
    }

}
