// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcecenter20221201.models;

import com.aliyun.tea.*;

public class UpdateSavedQueryResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateSavedQueryResponseBody body;

    public static UpdateSavedQueryResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateSavedQueryResponse self = new UpdateSavedQueryResponse();
        return TeaModel.build(map, self);
    }

    public UpdateSavedQueryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateSavedQueryResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateSavedQueryResponse setBody(UpdateSavedQueryResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateSavedQueryResponseBody getBody() {
        return this.body;
    }

}
