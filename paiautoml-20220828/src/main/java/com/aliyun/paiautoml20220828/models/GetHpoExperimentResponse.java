// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paiautoml20220828.models;

import com.aliyun.tea.*;

public class GetHpoExperimentResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetHpoExperimentResponseBody body;

    public static GetHpoExperimentResponse build(java.util.Map<String, ?> map) throws Exception {
        GetHpoExperimentResponse self = new GetHpoExperimentResponse();
        return TeaModel.build(map, self);
    }

    public GetHpoExperimentResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetHpoExperimentResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetHpoExperimentResponse setBody(GetHpoExperimentResponseBody body) {
        this.body = body;
        return this;
    }
    public GetHpoExperimentResponseBody getBody() {
        return this.body;
    }

}
