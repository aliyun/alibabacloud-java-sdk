// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class UpdateProfileCatalogResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateProfileCatalogResponseBody body;

    public static UpdateProfileCatalogResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateProfileCatalogResponse self = new UpdateProfileCatalogResponse();
        return TeaModel.build(map, self);
    }

    public UpdateProfileCatalogResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateProfileCatalogResponse setBody(UpdateProfileCatalogResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateProfileCatalogResponseBody getBody() {
        return this.body;
    }

}
