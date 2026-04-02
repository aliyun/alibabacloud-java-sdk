// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dsw20220101.models;

import com.aliyun.tea.*;

public class DeleteTempFileTasksResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteTempFileTasksResponseBody body;

    public static DeleteTempFileTasksResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteTempFileTasksResponse self = new DeleteTempFileTasksResponse();
        return TeaModel.build(map, self);
    }

    public DeleteTempFileTasksResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteTempFileTasksResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteTempFileTasksResponse setBody(DeleteTempFileTasksResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteTempFileTasksResponseBody getBody() {
        return this.body;
    }

}
