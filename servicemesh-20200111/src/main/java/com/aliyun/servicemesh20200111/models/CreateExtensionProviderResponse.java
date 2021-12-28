// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class CreateExtensionProviderResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateExtensionProviderResponseBody body;

    public static CreateExtensionProviderResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateExtensionProviderResponse self = new CreateExtensionProviderResponse();
        return TeaModel.build(map, self);
    }

    public CreateExtensionProviderResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateExtensionProviderResponse setBody(CreateExtensionProviderResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateExtensionProviderResponseBody getBody() {
        return this.body;
    }

}
