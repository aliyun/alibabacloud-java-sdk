// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yike20260319.models;

import com.aliyun.tea.*;

public class GetYikeProjectExportJobResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetYikeProjectExportJobResponseBody body;

    public static GetYikeProjectExportJobResponse build(java.util.Map<String, ?> map) throws Exception {
        GetYikeProjectExportJobResponse self = new GetYikeProjectExportJobResponse();
        return TeaModel.build(map, self);
    }

    public GetYikeProjectExportJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetYikeProjectExportJobResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetYikeProjectExportJobResponse setBody(GetYikeProjectExportJobResponseBody body) {
        this.body = body;
        return this;
    }
    public GetYikeProjectExportJobResponseBody getBody() {
        return this.body;
    }

}
