// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paiautoml20220828.models;

import com.aliyun.tea.*;

public class GetHpoTrialResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetHpoTrialResponseBody body;

    public static GetHpoTrialResponse build(java.util.Map<String, ?> map) throws Exception {
        GetHpoTrialResponse self = new GetHpoTrialResponse();
        return TeaModel.build(map, self);
    }

    public GetHpoTrialResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetHpoTrialResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetHpoTrialResponse setBody(GetHpoTrialResponseBody body) {
        this.body = body;
        return this;
    }
    public GetHpoTrialResponseBody getBody() {
        return this.body;
    }

}
