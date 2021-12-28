// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class UpdateExtensionProviderResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateExtensionProviderResponseBody body;

    public static UpdateExtensionProviderResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateExtensionProviderResponse self = new UpdateExtensionProviderResponse();
        return TeaModel.build(map, self);
    }

    public UpdateExtensionProviderResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateExtensionProviderResponse setBody(UpdateExtensionProviderResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateExtensionProviderResponseBody getBody() {
        return this.body;
    }

}
