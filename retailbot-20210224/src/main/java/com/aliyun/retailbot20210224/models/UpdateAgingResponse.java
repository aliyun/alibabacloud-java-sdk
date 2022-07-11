// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailbot20210224.models;

import com.aliyun.tea.*;

public class UpdateAgingResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateAgingResponseBody body;

    public static UpdateAgingResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateAgingResponse self = new UpdateAgingResponse();
        return TeaModel.build(map, self);
    }

    public UpdateAgingResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateAgingResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateAgingResponse setBody(UpdateAgingResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateAgingResponseBody getBody() {
        return this.body;
    }

}
