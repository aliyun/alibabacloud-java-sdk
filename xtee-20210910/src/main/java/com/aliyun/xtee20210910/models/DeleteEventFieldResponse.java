// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DeleteEventFieldResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteEventFieldResponseBody body;

    public static DeleteEventFieldResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteEventFieldResponse self = new DeleteEventFieldResponse();
        return TeaModel.build(map, self);
    }

    public DeleteEventFieldResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteEventFieldResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteEventFieldResponse setBody(DeleteEventFieldResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteEventFieldResponseBody getBody() {
        return this.body;
    }

}
