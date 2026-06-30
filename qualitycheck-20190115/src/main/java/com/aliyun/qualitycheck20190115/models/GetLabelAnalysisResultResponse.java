// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qualitycheck20190115.models;

import com.aliyun.tea.*;

public class GetLabelAnalysisResultResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetLabelAnalysisResultResponseBody body;

    public static GetLabelAnalysisResultResponse build(java.util.Map<String, ?> map) throws Exception {
        GetLabelAnalysisResultResponse self = new GetLabelAnalysisResultResponse();
        return TeaModel.build(map, self);
    }

    public GetLabelAnalysisResultResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetLabelAnalysisResultResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetLabelAnalysisResultResponse setBody(GetLabelAnalysisResultResponseBody body) {
        this.body = body;
        return this;
    }
    public GetLabelAnalysisResultResponseBody getBody() {
        return this.body;
    }

}
