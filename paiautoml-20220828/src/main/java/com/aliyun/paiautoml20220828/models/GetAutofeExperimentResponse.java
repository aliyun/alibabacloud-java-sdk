// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paiautoml20220828.models;

import com.aliyun.tea.*;

public class GetAutofeExperimentResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetAutofeExperimentResponseBody body;

    public static GetAutofeExperimentResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAutofeExperimentResponse self = new GetAutofeExperimentResponse();
        return TeaModel.build(map, self);
    }

    public GetAutofeExperimentResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetAutofeExperimentResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetAutofeExperimentResponse setBody(GetAutofeExperimentResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAutofeExperimentResponseBody getBody() {
        return this.body;
    }

}
