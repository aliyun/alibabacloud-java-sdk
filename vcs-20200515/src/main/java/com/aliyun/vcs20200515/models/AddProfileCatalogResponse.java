// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class AddProfileCatalogResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public AddProfileCatalogResponseBody body;

    public static AddProfileCatalogResponse build(java.util.Map<String, ?> map) throws Exception {
        AddProfileCatalogResponse self = new AddProfileCatalogResponse();
        return TeaModel.build(map, self);
    }

    public AddProfileCatalogResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddProfileCatalogResponse setBody(AddProfileCatalogResponseBody body) {
        this.body = body;
        return this;
    }
    public AddProfileCatalogResponseBody getBody() {
        return this.body;
    }

}
