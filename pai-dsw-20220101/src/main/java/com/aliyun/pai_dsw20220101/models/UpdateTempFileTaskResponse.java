// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dsw20220101.models;

import com.aliyun.tea.*;

public class UpdateTempFileTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateTempFileTaskResponseBody body;

    public static UpdateTempFileTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateTempFileTaskResponse self = new UpdateTempFileTaskResponse();
        return TeaModel.build(map, self);
    }

    public UpdateTempFileTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateTempFileTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateTempFileTaskResponse setBody(UpdateTempFileTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateTempFileTaskResponseBody getBody() {
        return this.body;
    }

}
