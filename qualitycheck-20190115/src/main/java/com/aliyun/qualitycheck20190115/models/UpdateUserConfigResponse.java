// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qualitycheck20190115.models;

import com.aliyun.tea.*;

public class UpdateUserConfigResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateUserConfigResponseBody body;

    public static UpdateUserConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateUserConfigResponse self = new UpdateUserConfigResponse();
        return TeaModel.build(map, self);
    }

    public UpdateUserConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateUserConfigResponse setBody(UpdateUserConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateUserConfigResponseBody getBody() {
        return this.body;
    }

}
