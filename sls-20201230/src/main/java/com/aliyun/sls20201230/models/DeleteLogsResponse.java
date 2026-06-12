// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class DeleteLogsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteLogsResponseBody body;

    public static DeleteLogsResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteLogsResponse self = new DeleteLogsResponse();
        return TeaModel.build(map, self);
    }

    public DeleteLogsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteLogsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteLogsResponse setBody(DeleteLogsResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteLogsResponseBody getBody() {
        return this.body;
    }

}
