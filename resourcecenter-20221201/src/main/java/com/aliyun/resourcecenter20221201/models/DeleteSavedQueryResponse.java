// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcecenter20221201.models;

import com.aliyun.tea.*;

public class DeleteSavedQueryResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteSavedQueryResponseBody body;

    public static DeleteSavedQueryResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteSavedQueryResponse self = new DeleteSavedQueryResponse();
        return TeaModel.build(map, self);
    }

    public DeleteSavedQueryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteSavedQueryResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteSavedQueryResponse setBody(DeleteSavedQueryResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteSavedQueryResponseBody getBody() {
        return this.body;
    }

}
