// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailcloud20180313.models;

import com.aliyun.tea.*;

public class UpdateDeployConfigResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateDeployConfigResponseBody body;

    public static UpdateDeployConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateDeployConfigResponse self = new UpdateDeployConfigResponse();
        return TeaModel.build(map, self);
    }

    public UpdateDeployConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateDeployConfigResponse setBody(UpdateDeployConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateDeployConfigResponseBody getBody() {
        return this.body;
    }

}
