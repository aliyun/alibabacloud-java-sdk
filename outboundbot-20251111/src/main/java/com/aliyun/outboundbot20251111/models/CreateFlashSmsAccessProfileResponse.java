// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20251111.models;

import com.aliyun.tea.*;

public class CreateFlashSmsAccessProfileResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateFlashSmsAccessProfileResponseBody body;

    public static CreateFlashSmsAccessProfileResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateFlashSmsAccessProfileResponse self = new CreateFlashSmsAccessProfileResponse();
        return TeaModel.build(map, self);
    }

    public CreateFlashSmsAccessProfileResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateFlashSmsAccessProfileResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateFlashSmsAccessProfileResponse setBody(CreateFlashSmsAccessProfileResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateFlashSmsAccessProfileResponseBody getBody() {
        return this.body;
    }

}
