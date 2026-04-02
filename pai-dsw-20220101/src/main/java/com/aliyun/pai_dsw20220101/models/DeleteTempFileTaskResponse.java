// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dsw20220101.models;

import com.aliyun.tea.*;

public class DeleteTempFileTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteTempFileTaskResponseBody body;

    public static DeleteTempFileTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteTempFileTaskResponse self = new DeleteTempFileTaskResponse();
        return TeaModel.build(map, self);
    }

    public DeleteTempFileTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteTempFileTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteTempFileTaskResponse setBody(DeleteTempFileTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteTempFileTaskResponseBody getBody() {
        return this.body;
    }

}
