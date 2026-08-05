// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchplat20240401.models;

import com.aliyun.tea.*;

public class DeleteOfflineTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteOfflineTaskResponseBody body;

    public static DeleteOfflineTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteOfflineTaskResponse self = new DeleteOfflineTaskResponse();
        return TeaModel.build(map, self);
    }

    public DeleteOfflineTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteOfflineTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteOfflineTaskResponse setBody(DeleteOfflineTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteOfflineTaskResponseBody getBody() {
        return this.body;
    }

}
