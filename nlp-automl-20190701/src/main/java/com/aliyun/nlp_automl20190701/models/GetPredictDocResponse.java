// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nlp_automl20190701.models;

import com.aliyun.tea.*;

public class GetPredictDocResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetPredictDocResponseBody body;

    public static GetPredictDocResponse build(java.util.Map<String, ?> map) throws Exception {
        GetPredictDocResponse self = new GetPredictDocResponse();
        return TeaModel.build(map, self);
    }

    public GetPredictDocResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetPredictDocResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetPredictDocResponse setBody(GetPredictDocResponseBody body) {
        this.body = body;
        return this;
    }
    public GetPredictDocResponseBody getBody() {
        return this.body;
    }

}
