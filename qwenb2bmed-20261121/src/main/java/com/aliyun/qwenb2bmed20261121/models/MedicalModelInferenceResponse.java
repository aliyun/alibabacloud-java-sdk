// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qwenb2bmed20261121.models;

import com.aliyun.tea.*;

public class MedicalModelInferenceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public MedicalModelInferenceResponseBody body;

    public static MedicalModelInferenceResponse build(java.util.Map<String, ?> map) throws Exception {
        MedicalModelInferenceResponse self = new MedicalModelInferenceResponse();
        return TeaModel.build(map, self);
    }

    public MedicalModelInferenceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public MedicalModelInferenceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public MedicalModelInferenceResponse setBody(MedicalModelInferenceResponseBody body) {
        this.body = body;
        return this;
    }
    public MedicalModelInferenceResponseBody getBody() {
        return this.body;
    }

}
