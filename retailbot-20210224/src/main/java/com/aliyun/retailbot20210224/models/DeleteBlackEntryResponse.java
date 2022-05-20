// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailbot20210224.models;

import com.aliyun.tea.*;

public class DeleteBlackEntryResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteBlackEntryResponseBody body;

    public static DeleteBlackEntryResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteBlackEntryResponse self = new DeleteBlackEntryResponse();
        return TeaModel.build(map, self);
    }

    public DeleteBlackEntryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteBlackEntryResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteBlackEntryResponse setBody(DeleteBlackEntryResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteBlackEntryResponseBody getBody() {
        return this.body;
    }

}
