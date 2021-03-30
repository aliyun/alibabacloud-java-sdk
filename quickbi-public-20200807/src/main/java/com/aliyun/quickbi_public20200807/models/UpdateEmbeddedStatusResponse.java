// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20200807.models;

import com.aliyun.tea.*;

public class UpdateEmbeddedStatusResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateEmbeddedStatusResponseBody body;

    public static UpdateEmbeddedStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateEmbeddedStatusResponse self = new UpdateEmbeddedStatusResponse();
        return TeaModel.build(map, self);
    }

    public UpdateEmbeddedStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateEmbeddedStatusResponse setBody(UpdateEmbeddedStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateEmbeddedStatusResponseBody getBody() {
        return this.body;
    }

}
