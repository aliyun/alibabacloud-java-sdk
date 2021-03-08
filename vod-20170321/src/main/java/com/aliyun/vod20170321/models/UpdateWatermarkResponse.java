// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class UpdateWatermarkResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateWatermarkResponseBody body;

    public static UpdateWatermarkResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateWatermarkResponse self = new UpdateWatermarkResponse();
        return TeaModel.build(map, self);
    }

    public UpdateWatermarkResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateWatermarkResponse setBody(UpdateWatermarkResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateWatermarkResponseBody getBody() {
        return this.body;
    }

}
