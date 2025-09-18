// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sfmmultimodalapp20250909.models;

import com.aliyun.tea.*;

public class DeleteMmAppResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteMmAppResponseBody body;

    public static DeleteMmAppResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteMmAppResponse self = new DeleteMmAppResponse();
        return TeaModel.build(map, self);
    }

    public DeleteMmAppResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteMmAppResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteMmAppResponse setBody(DeleteMmAppResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteMmAppResponseBody getBody() {
        return this.body;
    }

}
