// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class SetServiceRegistrySourceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public SetServiceRegistrySourceResponseBody body;

    public static SetServiceRegistrySourceResponse build(java.util.Map<String, ?> map) throws Exception {
        SetServiceRegistrySourceResponse self = new SetServiceRegistrySourceResponse();
        return TeaModel.build(map, self);
    }

    public SetServiceRegistrySourceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SetServiceRegistrySourceResponse setBody(SetServiceRegistrySourceResponseBody body) {
        this.body = body;
        return this;
    }
    public SetServiceRegistrySourceResponseBody getBody() {
        return this.body;
    }

}
