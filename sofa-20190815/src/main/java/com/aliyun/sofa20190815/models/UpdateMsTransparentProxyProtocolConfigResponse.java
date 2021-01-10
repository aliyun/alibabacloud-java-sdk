// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class UpdateMsTransparentProxyProtocolConfigResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateMsTransparentProxyProtocolConfigResponseBody body;

    public static UpdateMsTransparentProxyProtocolConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateMsTransparentProxyProtocolConfigResponse self = new UpdateMsTransparentProxyProtocolConfigResponse();
        return TeaModel.build(map, self);
    }

    public UpdateMsTransparentProxyProtocolConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateMsTransparentProxyProtocolConfigResponse setBody(UpdateMsTransparentProxyProtocolConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateMsTransparentProxyProtocolConfigResponseBody getBody() {
        return this.body;
    }

}
