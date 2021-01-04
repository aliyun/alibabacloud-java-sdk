// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class CreateSmartAccessGatewaySoftwareResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateSmartAccessGatewaySoftwareResponseBody body;

    public static CreateSmartAccessGatewaySoftwareResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateSmartAccessGatewaySoftwareResponse self = new CreateSmartAccessGatewaySoftwareResponse();
        return TeaModel.build(map, self);
    }

    public CreateSmartAccessGatewaySoftwareResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateSmartAccessGatewaySoftwareResponse setBody(CreateSmartAccessGatewaySoftwareResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateSmartAccessGatewaySoftwareResponseBody getBody() {
        return this.body;
    }

}
