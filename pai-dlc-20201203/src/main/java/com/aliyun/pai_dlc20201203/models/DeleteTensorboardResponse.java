// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dlc20201203.models;

import com.aliyun.tea.*;

public class DeleteTensorboardResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteTensorboardResponseBody body;

    public static DeleteTensorboardResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteTensorboardResponse self = new DeleteTensorboardResponse();
        return TeaModel.build(map, self);
    }

    public DeleteTensorboardResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteTensorboardResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteTensorboardResponse setBody(DeleteTensorboardResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteTensorboardResponseBody getBody() {
        return this.body;
    }

}
