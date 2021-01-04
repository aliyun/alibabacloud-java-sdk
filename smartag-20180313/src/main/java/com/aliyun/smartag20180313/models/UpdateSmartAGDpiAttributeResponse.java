// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class UpdateSmartAGDpiAttributeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateSmartAGDpiAttributeResponseBody body;

    public static UpdateSmartAGDpiAttributeResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateSmartAGDpiAttributeResponse self = new UpdateSmartAGDpiAttributeResponse();
        return TeaModel.build(map, self);
    }

    public UpdateSmartAGDpiAttributeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateSmartAGDpiAttributeResponse setBody(UpdateSmartAGDpiAttributeResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateSmartAGDpiAttributeResponseBody getBody() {
        return this.body;
    }

}
