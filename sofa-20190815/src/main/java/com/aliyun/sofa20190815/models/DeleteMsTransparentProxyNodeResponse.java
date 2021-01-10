// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class DeleteMsTransparentProxyNodeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteMsTransparentProxyNodeResponseBody body;

    public static DeleteMsTransparentProxyNodeResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteMsTransparentProxyNodeResponse self = new DeleteMsTransparentProxyNodeResponse();
        return TeaModel.build(map, self);
    }

    public DeleteMsTransparentProxyNodeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteMsTransparentProxyNodeResponse setBody(DeleteMsTransparentProxyNodeResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteMsTransparentProxyNodeResponseBody getBody() {
        return this.body;
    }

}
