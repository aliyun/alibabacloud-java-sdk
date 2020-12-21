// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class UpdateDeviceCaptureStrategyResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateDeviceCaptureStrategyResponseBody body;

    public static UpdateDeviceCaptureStrategyResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateDeviceCaptureStrategyResponse self = new UpdateDeviceCaptureStrategyResponse();
        return TeaModel.build(map, self);
    }

    public UpdateDeviceCaptureStrategyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateDeviceCaptureStrategyResponse setBody(UpdateDeviceCaptureStrategyResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateDeviceCaptureStrategyResponseBody getBody() {
        return this.body;
    }

}
