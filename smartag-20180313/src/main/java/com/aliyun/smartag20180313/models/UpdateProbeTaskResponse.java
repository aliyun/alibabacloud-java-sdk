// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class UpdateProbeTaskResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateProbeTaskResponseBody body;

    public static UpdateProbeTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateProbeTaskResponse self = new UpdateProbeTaskResponse();
        return TeaModel.build(map, self);
    }

    public UpdateProbeTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateProbeTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateProbeTaskResponse setBody(UpdateProbeTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateProbeTaskResponseBody getBody() {
        return this.body;
    }

}
