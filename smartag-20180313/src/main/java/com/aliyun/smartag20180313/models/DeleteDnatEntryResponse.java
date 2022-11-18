// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class DeleteDnatEntryResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteDnatEntryResponseBody body;

    public static DeleteDnatEntryResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteDnatEntryResponse self = new DeleteDnatEntryResponse();
        return TeaModel.build(map, self);
    }

    public DeleteDnatEntryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteDnatEntryResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteDnatEntryResponse setBody(DeleteDnatEntryResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteDnatEntryResponseBody getBody() {
        return this.body;
    }

}
