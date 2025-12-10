// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paistudio20210202.models;

import com.aliyun.tea.*;

public class QueryExperimentVisualizationDataResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryExperimentVisualizationDataResponseBody body;

    public static QueryExperimentVisualizationDataResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryExperimentVisualizationDataResponse self = new QueryExperimentVisualizationDataResponse();
        return TeaModel.build(map, self);
    }

    public QueryExperimentVisualizationDataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryExperimentVisualizationDataResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryExperimentVisualizationDataResponse setBody(QueryExperimentVisualizationDataResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryExperimentVisualizationDataResponseBody getBody() {
        return this.body;
    }

}
