// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class DisableMsTransparentProxyNodeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DisableMsTransparentProxyNodeResponseBody body;

    public static DisableMsTransparentProxyNodeResponse build(java.util.Map<String, ?> map) throws Exception {
        DisableMsTransparentProxyNodeResponse self = new DisableMsTransparentProxyNodeResponse();
        return TeaModel.build(map, self);
    }

    public DisableMsTransparentProxyNodeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DisableMsTransparentProxyNodeResponse setBody(DisableMsTransparentProxyNodeResponseBody body) {
        this.body = body;
        return this;
    }
    public DisableMsTransparentProxyNodeResponseBody getBody() {
        return this.body;
    }

}
