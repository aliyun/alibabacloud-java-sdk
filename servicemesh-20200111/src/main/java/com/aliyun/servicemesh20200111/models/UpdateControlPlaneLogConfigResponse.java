// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class UpdateControlPlaneLogConfigResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateControlPlaneLogConfigResponseBody body;

    public static UpdateControlPlaneLogConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateControlPlaneLogConfigResponse self = new UpdateControlPlaneLogConfigResponse();
        return TeaModel.build(map, self);
    }

    public UpdateControlPlaneLogConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateControlPlaneLogConfigResponse setBody(UpdateControlPlaneLogConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateControlPlaneLogConfigResponseBody getBody() {
        return this.body;
    }

}
