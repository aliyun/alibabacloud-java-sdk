// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paistudio20210202.models;

import com.aliyun.tea.*;

public class GetExperimentStatusResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetExperimentStatusResponseBody body;

    public static GetExperimentStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        GetExperimentStatusResponse self = new GetExperimentStatusResponse();
        return TeaModel.build(map, self);
    }

    public GetExperimentStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetExperimentStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetExperimentStatusResponse setBody(GetExperimentStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public GetExperimentStatusResponseBody getBody() {
        return this.body;
    }

}
