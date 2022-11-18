// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class UpdateSmartAGAccessPointResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateSmartAGAccessPointResponseBody body;

    public static UpdateSmartAGAccessPointResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateSmartAGAccessPointResponse self = new UpdateSmartAGAccessPointResponse();
        return TeaModel.build(map, self);
    }

    public UpdateSmartAGAccessPointResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateSmartAGAccessPointResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateSmartAGAccessPointResponse setBody(UpdateSmartAGAccessPointResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateSmartAGAccessPointResponseBody getBody() {
        return this.body;
    }

}
