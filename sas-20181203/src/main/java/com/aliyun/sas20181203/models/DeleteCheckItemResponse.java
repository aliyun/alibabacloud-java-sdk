// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DeleteCheckItemResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteCheckItemResponseBody body;

    public static DeleteCheckItemResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteCheckItemResponse self = new DeleteCheckItemResponse();
        return TeaModel.build(map, self);
    }

    public DeleteCheckItemResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteCheckItemResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteCheckItemResponse setBody(DeleteCheckItemResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteCheckItemResponseBody getBody() {
        return this.body;
    }

}
