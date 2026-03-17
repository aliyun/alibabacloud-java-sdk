// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class UpdateSmartAGDpiAttributeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public UpdateSmartAGDpiAttributeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateSmartAGDpiAttributeResponse setBody(UpdateSmartAGDpiAttributeResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateSmartAGDpiAttributeResponseBody getBody() {
        return this.body;
    }

}
