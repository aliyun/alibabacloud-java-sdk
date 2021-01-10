// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class AddMsTransparentProxyNodeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public AddMsTransparentProxyNodeResponseBody body;

    public static AddMsTransparentProxyNodeResponse build(java.util.Map<String, ?> map) throws Exception {
        AddMsTransparentProxyNodeResponse self = new AddMsTransparentProxyNodeResponse();
        return TeaModel.build(map, self);
    }

    public AddMsTransparentProxyNodeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddMsTransparentProxyNodeResponse setBody(AddMsTransparentProxyNodeResponseBody body) {
        this.body = body;
        return this;
    }
    public AddMsTransparentProxyNodeResponseBody getBody() {
        return this.body;
    }

}
