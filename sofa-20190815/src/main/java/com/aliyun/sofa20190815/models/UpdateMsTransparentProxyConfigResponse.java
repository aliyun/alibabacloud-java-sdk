// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class UpdateMsTransparentProxyConfigResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateMsTransparentProxyConfigResponseBody body;

    public static UpdateMsTransparentProxyConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateMsTransparentProxyConfigResponse self = new UpdateMsTransparentProxyConfigResponse();
        return TeaModel.build(map, self);
    }

    public UpdateMsTransparentProxyConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateMsTransparentProxyConfigResponse setBody(UpdateMsTransparentProxyConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateMsTransparentProxyConfigResponseBody getBody() {
        return this.body;
    }

}
