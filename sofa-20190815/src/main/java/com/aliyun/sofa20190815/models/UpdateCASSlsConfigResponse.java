// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class UpdateCASSlsConfigResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateCASSlsConfigResponseBody body;

    public static UpdateCASSlsConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateCASSlsConfigResponse self = new UpdateCASSlsConfigResponse();
        return TeaModel.build(map, self);
    }

    public UpdateCASSlsConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateCASSlsConfigResponse setBody(UpdateCASSlsConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateCASSlsConfigResponseBody getBody() {
        return this.body;
    }

}
