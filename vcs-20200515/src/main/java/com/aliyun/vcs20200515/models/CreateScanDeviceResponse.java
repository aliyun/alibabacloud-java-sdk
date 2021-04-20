// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class CreateScanDeviceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateScanDeviceResponseBody body;

    public static CreateScanDeviceResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateScanDeviceResponse self = new CreateScanDeviceResponse();
        return TeaModel.build(map, self);
    }

    public CreateScanDeviceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateScanDeviceResponse setBody(CreateScanDeviceResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateScanDeviceResponseBody getBody() {
        return this.body;
    }

}
