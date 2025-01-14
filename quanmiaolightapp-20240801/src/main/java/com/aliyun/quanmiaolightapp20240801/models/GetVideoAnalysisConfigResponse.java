// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quanmiaolightapp20240801.models;

import com.aliyun.tea.*;

public class GetVideoAnalysisConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetVideoAnalysisConfigResponseBody body;

    public static GetVideoAnalysisConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        GetVideoAnalysisConfigResponse self = new GetVideoAnalysisConfigResponse();
        return TeaModel.build(map, self);
    }

    public GetVideoAnalysisConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetVideoAnalysisConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetVideoAnalysisConfigResponse setBody(GetVideoAnalysisConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public GetVideoAnalysisConfigResponseBody getBody() {
        return this.body;
    }

}
