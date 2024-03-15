// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ocr_api20210707.models;

import com.aliyun.tea.*;

public class RecognizeVehicleRegistrationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RecognizeVehicleRegistrationResponseBody body;

    public static RecognizeVehicleRegistrationResponse build(java.util.Map<String, ?> map) throws Exception {
        RecognizeVehicleRegistrationResponse self = new RecognizeVehicleRegistrationResponse();
        return TeaModel.build(map, self);
    }

    public RecognizeVehicleRegistrationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RecognizeVehicleRegistrationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RecognizeVehicleRegistrationResponse setBody(RecognizeVehicleRegistrationResponseBody body) {
        this.body = body;
        return this;
    }
    public RecognizeVehicleRegistrationResponseBody getBody() {
        return this.body;
    }

}
