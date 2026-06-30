// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yike20260319.models;

import com.aliyun.tea.*;

public class SubmitYikeProjectExportJobResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SubmitYikeProjectExportJobResponseBody body;

    public static SubmitYikeProjectExportJobResponse build(java.util.Map<String, ?> map) throws Exception {
        SubmitYikeProjectExportJobResponse self = new SubmitYikeProjectExportJobResponse();
        return TeaModel.build(map, self);
    }

    public SubmitYikeProjectExportJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SubmitYikeProjectExportJobResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SubmitYikeProjectExportJobResponse setBody(SubmitYikeProjectExportJobResponseBody body) {
        this.body = body;
        return this;
    }
    public SubmitYikeProjectExportJobResponseBody getBody() {
        return this.body;
    }

}
