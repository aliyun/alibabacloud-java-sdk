// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailcloud20180313.models;

import com.aliyun.tea.*;

public class UpdateEciConfigResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateEciConfigResponseBody body;

    public static UpdateEciConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateEciConfigResponse self = new UpdateEciConfigResponse();
        return TeaModel.build(map, self);
    }

    public UpdateEciConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateEciConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateEciConfigResponse setBody(UpdateEciConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateEciConfigResponseBody getBody() {
        return this.body;
    }

}
