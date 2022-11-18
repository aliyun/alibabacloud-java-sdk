// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class UpdateSmartAGUserAccelerateConfigResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateSmartAGUserAccelerateConfigResponseBody body;

    public static UpdateSmartAGUserAccelerateConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateSmartAGUserAccelerateConfigResponse self = new UpdateSmartAGUserAccelerateConfigResponse();
        return TeaModel.build(map, self);
    }

    public UpdateSmartAGUserAccelerateConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateSmartAGUserAccelerateConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateSmartAGUserAccelerateConfigResponse setBody(UpdateSmartAGUserAccelerateConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateSmartAGUserAccelerateConfigResponseBody getBody() {
        return this.body;
    }

}
