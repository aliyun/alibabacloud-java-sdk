// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ConfirmLinkefabricFabricSmartdeployconfigsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ConfirmLinkefabricFabricSmartdeployconfigsResponseBody body;

    public static ConfirmLinkefabricFabricSmartdeployconfigsResponse build(java.util.Map<String, ?> map) throws Exception {
        ConfirmLinkefabricFabricSmartdeployconfigsResponse self = new ConfirmLinkefabricFabricSmartdeployconfigsResponse();
        return TeaModel.build(map, self);
    }

    public ConfirmLinkefabricFabricSmartdeployconfigsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ConfirmLinkefabricFabricSmartdeployconfigsResponse setBody(ConfirmLinkefabricFabricSmartdeployconfigsResponseBody body) {
        this.body = body;
        return this;
    }
    public ConfirmLinkefabricFabricSmartdeployconfigsResponseBody getBody() {
        return this.body;
    }

}
