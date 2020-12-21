// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class DeleteProfileCatalogResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteProfileCatalogResponseBody body;

    public static DeleteProfileCatalogResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteProfileCatalogResponse self = new DeleteProfileCatalogResponse();
        return TeaModel.build(map, self);
    }

    public DeleteProfileCatalogResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteProfileCatalogResponse setBody(DeleteProfileCatalogResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteProfileCatalogResponseBody getBody() {
        return this.body;
    }

}
