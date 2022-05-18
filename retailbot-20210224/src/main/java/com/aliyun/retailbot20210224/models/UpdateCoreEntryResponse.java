// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailbot20210224.models;

import com.aliyun.tea.*;

public class UpdateCoreEntryResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateCoreEntryResponseBody body;

    public static UpdateCoreEntryResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateCoreEntryResponse self = new UpdateCoreEntryResponse();
        return TeaModel.build(map, self);
    }

    public UpdateCoreEntryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateCoreEntryResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateCoreEntryResponse setBody(UpdateCoreEntryResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateCoreEntryResponseBody getBody() {
        return this.body;
    }

}
