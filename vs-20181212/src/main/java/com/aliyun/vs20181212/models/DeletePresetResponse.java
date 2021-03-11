// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class DeletePresetResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeletePresetResponseBody body;

    public static DeletePresetResponse build(java.util.Map<String, ?> map) throws Exception {
        DeletePresetResponse self = new DeletePresetResponse();
        return TeaModel.build(map, self);
    }

    public DeletePresetResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeletePresetResponse setBody(DeletePresetResponseBody body) {
        this.body = body;
        return this;
    }
    public DeletePresetResponseBody getBody() {
        return this.body;
    }

}
