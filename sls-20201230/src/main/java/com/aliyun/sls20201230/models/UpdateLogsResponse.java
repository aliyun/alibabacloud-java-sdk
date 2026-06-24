// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class UpdateLogsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateLogsResponseBody body;

    public static UpdateLogsResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateLogsResponse self = new UpdateLogsResponse();
        return TeaModel.build(map, self);
    }

    public UpdateLogsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateLogsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateLogsResponse setBody(UpdateLogsResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateLogsResponseBody getBody() {
        return this.body;
    }

}
