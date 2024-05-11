// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paiabtest20240119.models;

import com.aliyun.tea.*;

public class GetExperimentVersionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetExperimentVersionResponseBody body;

    public static GetExperimentVersionResponse build(java.util.Map<String, ?> map) throws Exception {
        GetExperimentVersionResponse self = new GetExperimentVersionResponse();
        return TeaModel.build(map, self);
    }

    public GetExperimentVersionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetExperimentVersionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetExperimentVersionResponse setBody(GetExperimentVersionResponseBody body) {
        this.body = body;
        return this;
    }
    public GetExperimentVersionResponseBody getBody() {
        return this.body;
    }

}
