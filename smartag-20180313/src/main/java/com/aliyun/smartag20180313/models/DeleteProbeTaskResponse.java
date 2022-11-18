// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class DeleteProbeTaskResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteProbeTaskResponseBody body;

    public static DeleteProbeTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteProbeTaskResponse self = new DeleteProbeTaskResponse();
        return TeaModel.build(map, self);
    }

    public DeleteProbeTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteProbeTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteProbeTaskResponse setBody(DeleteProbeTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteProbeTaskResponseBody getBody() {
        return this.body;
    }

}
