// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class EnableMsTransparentProxyNodeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public EnableMsTransparentProxyNodeResponseBody body;

    public static EnableMsTransparentProxyNodeResponse build(java.util.Map<String, ?> map) throws Exception {
        EnableMsTransparentProxyNodeResponse self = new EnableMsTransparentProxyNodeResponse();
        return TeaModel.build(map, self);
    }

    public EnableMsTransparentProxyNodeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public EnableMsTransparentProxyNodeResponse setBody(EnableMsTransparentProxyNodeResponseBody body) {
        this.body = body;
        return this;
    }
    public EnableMsTransparentProxyNodeResponseBody getBody() {
        return this.body;
    }

}
