// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sysom20231230.models;

import com.aliyun.tea.*;

public class GetHotspotAnalysisResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetHotspotAnalysisResponseBody body;

    public static GetHotspotAnalysisResponse build(java.util.Map<String, ?> map) throws Exception {
        GetHotspotAnalysisResponse self = new GetHotspotAnalysisResponse();
        return TeaModel.build(map, self);
    }

    public GetHotspotAnalysisResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetHotspotAnalysisResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetHotspotAnalysisResponse setBody(GetHotspotAnalysisResponseBody body) {
        this.body = body;
        return this;
    }
    public GetHotspotAnalysisResponseBody getBody() {
        return this.body;
    }

}
