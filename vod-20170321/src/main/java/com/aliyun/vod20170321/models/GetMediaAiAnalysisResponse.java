// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class GetMediaAiAnalysisResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetMediaAiAnalysisResponseBody body;

    public static GetMediaAiAnalysisResponse build(java.util.Map<String, ?> map) throws Exception {
        GetMediaAiAnalysisResponse self = new GetMediaAiAnalysisResponse();
        return TeaModel.build(map, self);
    }

    public GetMediaAiAnalysisResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetMediaAiAnalysisResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetMediaAiAnalysisResponse setBody(GetMediaAiAnalysisResponseBody body) {
        this.body = body;
        return this;
    }
    public GetMediaAiAnalysisResponseBody getBody() {
        return this.body;
    }

}
