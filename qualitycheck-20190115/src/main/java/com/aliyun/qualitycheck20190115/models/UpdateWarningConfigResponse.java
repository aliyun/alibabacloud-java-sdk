// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qualitycheck20190115.models;

import com.aliyun.tea.*;

public class UpdateWarningConfigResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateWarningConfigResponseBody body;

    public static UpdateWarningConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateWarningConfigResponse self = new UpdateWarningConfigResponse();
        return TeaModel.build(map, self);
    }

    public UpdateWarningConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateWarningConfigResponse setBody(UpdateWarningConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateWarningConfigResponseBody getBody() {
        return this.body;
    }

}
