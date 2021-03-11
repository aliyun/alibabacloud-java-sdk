// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class UpdateVsPullStreamInfoConfigResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateVsPullStreamInfoConfigResponseBody body;

    public static UpdateVsPullStreamInfoConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateVsPullStreamInfoConfigResponse self = new UpdateVsPullStreamInfoConfigResponse();
        return TeaModel.build(map, self);
    }

    public UpdateVsPullStreamInfoConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateVsPullStreamInfoConfigResponse setBody(UpdateVsPullStreamInfoConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateVsPullStreamInfoConfigResponseBody getBody() {
        return this.body;
    }

}
