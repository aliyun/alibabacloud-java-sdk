// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds_data20220330.models;

import com.aliyun.tea.*;

public class UpdateResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateResponseBody body;

    public static UpdateResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateResponse self = new UpdateResponse();
        return TeaModel.build(map, self);
    }

    public UpdateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateResponse setBody(UpdateResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateResponseBody getBody() {
        return this.body;
    }

}
