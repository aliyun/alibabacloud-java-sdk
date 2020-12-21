// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class GetDeviceCaptureStrategyResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetDeviceCaptureStrategyResponseBody body;

    public static GetDeviceCaptureStrategyResponse build(java.util.Map<String, ?> map) throws Exception {
        GetDeviceCaptureStrategyResponse self = new GetDeviceCaptureStrategyResponse();
        return TeaModel.build(map, self);
    }

    public GetDeviceCaptureStrategyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetDeviceCaptureStrategyResponse setBody(GetDeviceCaptureStrategyResponseBody body) {
        this.body = body;
        return this;
    }
    public GetDeviceCaptureStrategyResponseBody getBody() {
        return this.body;
    }

}
