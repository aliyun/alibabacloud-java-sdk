// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ConfirmLinkefabricFabricDrmconfigsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ConfirmLinkefabricFabricDrmconfigsResponseBody body;

    public static ConfirmLinkefabricFabricDrmconfigsResponse build(java.util.Map<String, ?> map) throws Exception {
        ConfirmLinkefabricFabricDrmconfigsResponse self = new ConfirmLinkefabricFabricDrmconfigsResponse();
        return TeaModel.build(map, self);
    }

    public ConfirmLinkefabricFabricDrmconfigsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ConfirmLinkefabricFabricDrmconfigsResponse setBody(ConfirmLinkefabricFabricDrmconfigsResponseBody body) {
        this.body = body;
        return this;
    }
    public ConfirmLinkefabricFabricDrmconfigsResponseBody getBody() {
        return this.body;
    }

}
