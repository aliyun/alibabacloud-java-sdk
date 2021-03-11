// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class SetPresetResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public SetPresetResponseBody body;

    public static SetPresetResponse build(java.util.Map<String, ?> map) throws Exception {
        SetPresetResponse self = new SetPresetResponse();
        return TeaModel.build(map, self);
    }

    public SetPresetResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SetPresetResponse setBody(SetPresetResponseBody body) {
        this.body = body;
        return this;
    }
    public SetPresetResponseBody getBody() {
        return this.body;
    }

}
