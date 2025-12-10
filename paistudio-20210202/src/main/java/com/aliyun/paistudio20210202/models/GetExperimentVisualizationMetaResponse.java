// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paistudio20210202.models;

import com.aliyun.tea.*;

public class GetExperimentVisualizationMetaResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetExperimentVisualizationMetaResponseBody body;

    public static GetExperimentVisualizationMetaResponse build(java.util.Map<String, ?> map) throws Exception {
        GetExperimentVisualizationMetaResponse self = new GetExperimentVisualizationMetaResponse();
        return TeaModel.build(map, self);
    }

    public GetExperimentVisualizationMetaResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetExperimentVisualizationMetaResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetExperimentVisualizationMetaResponse setBody(GetExperimentVisualizationMetaResponseBody body) {
        this.body = body;
        return this;
    }
    public GetExperimentVisualizationMetaResponseBody getBody() {
        return this.body;
    }

}
