// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class UpdateNamespaceScopeSidecarConfigResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateNamespaceScopeSidecarConfigResponseBody body;

    public static UpdateNamespaceScopeSidecarConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateNamespaceScopeSidecarConfigResponse self = new UpdateNamespaceScopeSidecarConfigResponse();
        return TeaModel.build(map, self);
    }

    public UpdateNamespaceScopeSidecarConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateNamespaceScopeSidecarConfigResponse setBody(UpdateNamespaceScopeSidecarConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateNamespaceScopeSidecarConfigResponseBody getBody() {
        return this.body;
    }

}
