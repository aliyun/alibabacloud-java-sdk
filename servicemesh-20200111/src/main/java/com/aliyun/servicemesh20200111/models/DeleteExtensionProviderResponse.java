// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class DeleteExtensionProviderResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteExtensionProviderResponseBody body;

    public static DeleteExtensionProviderResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteExtensionProviderResponse self = new DeleteExtensionProviderResponse();
        return TeaModel.build(map, self);
    }

    public DeleteExtensionProviderResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteExtensionProviderResponse setBody(DeleteExtensionProviderResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteExtensionProviderResponseBody getBody() {
        return this.body;
    }

}
