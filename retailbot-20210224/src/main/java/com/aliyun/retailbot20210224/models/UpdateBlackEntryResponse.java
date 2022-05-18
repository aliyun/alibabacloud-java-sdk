// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailbot20210224.models;

import com.aliyun.tea.*;

public class UpdateBlackEntryResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateBlackEntryResponseBody body;

    public static UpdateBlackEntryResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateBlackEntryResponse self = new UpdateBlackEntryResponse();
        return TeaModel.build(map, self);
    }

    public UpdateBlackEntryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateBlackEntryResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateBlackEntryResponse setBody(UpdateBlackEntryResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateBlackEntryResponseBody getBody() {
        return this.body;
    }

}
