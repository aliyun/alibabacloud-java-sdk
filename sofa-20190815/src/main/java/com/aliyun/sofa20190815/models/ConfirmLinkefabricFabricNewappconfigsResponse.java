// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ConfirmLinkefabricFabricNewappconfigsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ConfirmLinkefabricFabricNewappconfigsResponseBody body;

    public static ConfirmLinkefabricFabricNewappconfigsResponse build(java.util.Map<String, ?> map) throws Exception {
        ConfirmLinkefabricFabricNewappconfigsResponse self = new ConfirmLinkefabricFabricNewappconfigsResponse();
        return TeaModel.build(map, self);
    }

    public ConfirmLinkefabricFabricNewappconfigsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ConfirmLinkefabricFabricNewappconfigsResponse setBody(ConfirmLinkefabricFabricNewappconfigsResponseBody body) {
        this.body = body;
        return this;
    }
    public ConfirmLinkefabricFabricNewappconfigsResponseBody getBody() {
        return this.body;
    }

}
