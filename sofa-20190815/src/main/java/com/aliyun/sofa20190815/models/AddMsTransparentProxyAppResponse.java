// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class AddMsTransparentProxyAppResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public AddMsTransparentProxyAppResponseBody body;

    public static AddMsTransparentProxyAppResponse build(java.util.Map<String, ?> map) throws Exception {
        AddMsTransparentProxyAppResponse self = new AddMsTransparentProxyAppResponse();
        return TeaModel.build(map, self);
    }

    public AddMsTransparentProxyAppResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddMsTransparentProxyAppResponse setBody(AddMsTransparentProxyAppResponseBody body) {
        this.body = body;
        return this;
    }
    public AddMsTransparentProxyAppResponseBody getBody() {
        return this.body;
    }

}
