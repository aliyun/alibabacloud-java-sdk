// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quanmiaolightapp20240801.models;

import com.aliyun.tea.*;

public class UpdateVideoAnalysisConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateVideoAnalysisConfigResponseBody body;

    public static UpdateVideoAnalysisConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateVideoAnalysisConfigResponse self = new UpdateVideoAnalysisConfigResponse();
        return TeaModel.build(map, self);
    }

    public UpdateVideoAnalysisConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateVideoAnalysisConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateVideoAnalysisConfigResponse setBody(UpdateVideoAnalysisConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateVideoAnalysisConfigResponseBody getBody() {
        return this.body;
    }

}
