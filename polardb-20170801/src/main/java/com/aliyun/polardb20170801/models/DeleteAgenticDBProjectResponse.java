// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DeleteAgenticDBProjectResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteAgenticDBProjectResponseBody body;

    public static DeleteAgenticDBProjectResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteAgenticDBProjectResponse self = new DeleteAgenticDBProjectResponse();
        return TeaModel.build(map, self);
    }

    public DeleteAgenticDBProjectResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteAgenticDBProjectResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteAgenticDBProjectResponse setBody(DeleteAgenticDBProjectResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteAgenticDBProjectResponseBody getBody() {
        return this.body;
    }

}
