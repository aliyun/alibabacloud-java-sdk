// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ConfirmLinkefabricFabricEnvconfigsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ConfirmLinkefabricFabricEnvconfigsResponseBody body;

    public static ConfirmLinkefabricFabricEnvconfigsResponse build(java.util.Map<String, ?> map) throws Exception {
        ConfirmLinkefabricFabricEnvconfigsResponse self = new ConfirmLinkefabricFabricEnvconfigsResponse();
        return TeaModel.build(map, self);
    }

    public ConfirmLinkefabricFabricEnvconfigsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ConfirmLinkefabricFabricEnvconfigsResponse setBody(ConfirmLinkefabricFabricEnvconfigsResponseBody body) {
        this.body = body;
        return this;
    }
    public ConfirmLinkefabricFabricEnvconfigsResponseBody getBody() {
        return this.body;
    }

}
