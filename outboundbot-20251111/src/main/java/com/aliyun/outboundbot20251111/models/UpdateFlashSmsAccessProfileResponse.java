// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20251111.models;

import com.aliyun.tea.*;

public class UpdateFlashSmsAccessProfileResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateFlashSmsAccessProfileResponseBody body;

    public static UpdateFlashSmsAccessProfileResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateFlashSmsAccessProfileResponse self = new UpdateFlashSmsAccessProfileResponse();
        return TeaModel.build(map, self);
    }

    public UpdateFlashSmsAccessProfileResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateFlashSmsAccessProfileResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateFlashSmsAccessProfileResponse setBody(UpdateFlashSmsAccessProfileResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateFlashSmsAccessProfileResponseBody getBody() {
        return this.body;
    }

}
