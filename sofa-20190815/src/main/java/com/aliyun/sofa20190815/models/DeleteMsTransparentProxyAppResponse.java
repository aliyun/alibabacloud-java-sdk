// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class DeleteMsTransparentProxyAppResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteMsTransparentProxyAppResponseBody body;

    public static DeleteMsTransparentProxyAppResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteMsTransparentProxyAppResponse self = new DeleteMsTransparentProxyAppResponse();
        return TeaModel.build(map, self);
    }

    public DeleteMsTransparentProxyAppResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteMsTransparentProxyAppResponse setBody(DeleteMsTransparentProxyAppResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteMsTransparentProxyAppResponseBody getBody() {
        return this.body;
    }

}
