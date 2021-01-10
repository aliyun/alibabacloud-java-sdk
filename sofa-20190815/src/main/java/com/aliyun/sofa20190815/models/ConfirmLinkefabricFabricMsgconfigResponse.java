// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ConfirmLinkefabricFabricMsgconfigResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ConfirmLinkefabricFabricMsgconfigResponseBody body;

    public static ConfirmLinkefabricFabricMsgconfigResponse build(java.util.Map<String, ?> map) throws Exception {
        ConfirmLinkefabricFabricMsgconfigResponse self = new ConfirmLinkefabricFabricMsgconfigResponse();
        return TeaModel.build(map, self);
    }

    public ConfirmLinkefabricFabricMsgconfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ConfirmLinkefabricFabricMsgconfigResponse setBody(ConfirmLinkefabricFabricMsgconfigResponseBody body) {
        this.body = body;
        return this;
    }
    public ConfirmLinkefabricFabricMsgconfigResponseBody getBody() {
        return this.body;
    }

}
