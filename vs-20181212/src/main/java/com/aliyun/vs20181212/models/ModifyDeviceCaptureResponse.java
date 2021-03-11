// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class ModifyDeviceCaptureResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ModifyDeviceCaptureResponseBody body;

    public static ModifyDeviceCaptureResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyDeviceCaptureResponse self = new ModifyDeviceCaptureResponse();
        return TeaModel.build(map, self);
    }

    public ModifyDeviceCaptureResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyDeviceCaptureResponse setBody(ModifyDeviceCaptureResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyDeviceCaptureResponseBody getBody() {
        return this.body;
    }

}
