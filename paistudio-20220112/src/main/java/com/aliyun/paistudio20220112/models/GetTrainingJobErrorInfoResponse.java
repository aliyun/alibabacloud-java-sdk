// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paistudio20220112.models;

import com.aliyun.tea.*;

public class GetTrainingJobErrorInfoResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetTrainingJobErrorInfoResponseBody body;

    public static GetTrainingJobErrorInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        GetTrainingJobErrorInfoResponse self = new GetTrainingJobErrorInfoResponse();
        return TeaModel.build(map, self);
    }

    public GetTrainingJobErrorInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetTrainingJobErrorInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetTrainingJobErrorInfoResponse setBody(GetTrainingJobErrorInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public GetTrainingJobErrorInfoResponseBody getBody() {
        return this.body;
    }

}
