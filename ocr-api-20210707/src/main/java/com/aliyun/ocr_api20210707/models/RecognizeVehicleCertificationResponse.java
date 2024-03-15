// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ocr_api20210707.models;

import com.aliyun.tea.*;

public class RecognizeVehicleCertificationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RecognizeVehicleCertificationResponseBody body;

    public static RecognizeVehicleCertificationResponse build(java.util.Map<String, ?> map) throws Exception {
        RecognizeVehicleCertificationResponse self = new RecognizeVehicleCertificationResponse();
        return TeaModel.build(map, self);
    }

    public RecognizeVehicleCertificationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RecognizeVehicleCertificationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RecognizeVehicleCertificationResponse setBody(RecognizeVehicleCertificationResponseBody body) {
        this.body = body;
        return this;
    }
    public RecognizeVehicleCertificationResponseBody getBody() {
        return this.body;
    }

}
