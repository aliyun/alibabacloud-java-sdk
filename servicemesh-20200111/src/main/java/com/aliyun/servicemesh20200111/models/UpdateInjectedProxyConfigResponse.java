// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class UpdateInjectedProxyConfigResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateInjectedProxyConfigResponseBody body;

    public static UpdateInjectedProxyConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateInjectedProxyConfigResponse self = new UpdateInjectedProxyConfigResponse();
        return TeaModel.build(map, self);
    }

    public UpdateInjectedProxyConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateInjectedProxyConfigResponse setBody(UpdateInjectedProxyConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateInjectedProxyConfigResponseBody getBody() {
        return this.body;
    }

}
