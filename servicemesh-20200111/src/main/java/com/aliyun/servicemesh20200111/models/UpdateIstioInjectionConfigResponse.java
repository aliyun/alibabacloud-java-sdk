// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class UpdateIstioInjectionConfigResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateIstioInjectionConfigResponseBody body;

    public static UpdateIstioInjectionConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateIstioInjectionConfigResponse self = new UpdateIstioInjectionConfigResponse();
        return TeaModel.build(map, self);
    }

    public UpdateIstioInjectionConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateIstioInjectionConfigResponse setBody(UpdateIstioInjectionConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateIstioInjectionConfigResponseBody getBody() {
        return this.body;
    }

}
