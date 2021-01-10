// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ConfirmLinkefabricFabricCiconfigsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ConfirmLinkefabricFabricCiconfigsResponseBody body;

    public static ConfirmLinkefabricFabricCiconfigsResponse build(java.util.Map<String, ?> map) throws Exception {
        ConfirmLinkefabricFabricCiconfigsResponse self = new ConfirmLinkefabricFabricCiconfigsResponse();
        return TeaModel.build(map, self);
    }

    public ConfirmLinkefabricFabricCiconfigsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ConfirmLinkefabricFabricCiconfigsResponse setBody(ConfirmLinkefabricFabricCiconfigsResponseBody body) {
        this.body = body;
        return this;
    }
    public ConfirmLinkefabricFabricCiconfigsResponseBody getBody() {
        return this.body;
    }

}
